/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessor;

import data.CartItem;
import data.FoodItem;
import data.User;
import java.util.List;

/**
 *
 * @author HP
 */
public class DataAccessor {

    private DataAccessor() {

    }

    public static void addItemToCart(User user, FoodItem foodItem) {
        // add cart details for perticuler user inside the db
    }

    public static void deleteItemFromCart(User user, FoodItem foodItem) {

    }

    public static DataAccessResult getFoodItemsWithNames(String foodName) {
        return null;
    }

    public static DataAccessResult getFoodItemById(int id) {
        return null;
    }

    public static void checkOutCart(User user) {

    }

    public static int createOrder(User user, List<CartItem> cartItems) {
        return 1;
    }

    public static void updateOrderStatus(int orderId, OrderStatus orderStatus) {

    }
}
