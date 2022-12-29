/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import Factory.PermissionFactory;
import data.CartItem;
import data.FoodItem;
import data.User;
import dataaccessor.DataAccessor;
import java.util.List;
import permission.AddToCartPermission;
import permission.Permission;

/**
 *
 * @author HP
 */
public class CartManager {

    List<CartItem> getUserCart(User user) {
        return null;
    }

    public void addItemToCart(User user, FoodItem foodItem) {
        // normal validation
        if (!PermissionFactory.getAddToCartPermission(user, foodItem).isPermitted()) {
            throw new RuntimeException("Permission denied");
        }

        // ek cheej aur check krna pdengi jo iteams phle se hai uska restro aur new item ka restro same hai yaa nahi
        if (!isFoodIteamFromSameRestro(user, foodItem)) {
            throw new RuntimeException("order from multiple restro");
        }
        // now we can insert the row into the cart table 
        DataAccessor.addItemToCart(user, foodItem);
    }

    public void deleteItemFromCart(User user, FoodItem foodItem) {

        // yeh method per concurency issues bhi ho skte hai / multiple thread aa jaaye access krne so we have to write synchronise or put locks 
        Permission permission = PermissionFactory.getDeleteFromCartPermission(user, foodItem);
        if (!permission.isPermitted()) {
            throw new RuntimeException("Permission denied");
        }

        // Now what if food item not presnet inside the cart and you want to delete it 
        if (!isFoodIteamPresentInsideTheCart(user, foodItem)) {
            throw new RuntimeException("food item not present inside the cart");
        }

        DataAccessor.deleteItemFromCart(user, foodItem);

    }

    public void checkOutUserCart(User user) {

        // normal validation 
        // permissions
        Permission permission = PermissionFactory.getCheckoutCartPermission(user);
        if (!permission.isPermitted()) {
            throw new RuntimeException("Permission denied");
        }
        // need to check is cart emtpy of not 
        if (!isCartEmpty(user)) {
            throw new RuntimeException("cart should not be emtpy");
        }
        DataAccessor.checkOutCart(user);

    }

    private boolean isFoodIteamFromSameRestro(User user, FoodItem foodItem) {
        int restroId = foodItem.getRestroId();
        // yeh id match kr rahi hai yaa nahi phle jo cart mai items thy unse ?
        List<CartItem> cartItems = getUserCart(user);

        return (cartItems.isEmpty() || cartItems.get(0).getFoodItem().getRestroId() == restroId);

    }

    private boolean isFoodIteamPresentInsideTheCart(User user, FoodItem foodItem) {
        List<CartItem> cartItems = getUserCart(user);
        if (cartItems.isEmpty() || cartItems == null) {
            return false;
        }
        for (CartItem cartItem : cartItems) {
            if (cartItem.getFoodItem().getFoodItemId() == foodItem.getFoodItemId()) {
                return true;
            }
        }
        return false;

    }

    private boolean isCartEmpty(User user) {
        List<CartItem> cartItems = getUserCart(user);
        if (cartItems.isEmpty() || cartItems == null) {
            return false;
        }
        return true;
    }

}
