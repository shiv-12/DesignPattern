/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permission;

import Searcher.RestroSearcher;
import data.FoodItem;
import data.Restro;
import data.User;
import managers.DeliveryManager;

/**
 *
 * @author HP
 */
public class AddToCartPermission implements Permission {

    private final User user;
    private final FoodItem foodItem;
    private DeliveryManager deliveryManager;

    public AddToCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
        this.deliveryManager = new DeliveryManager();
    }

    @Override
    public boolean isPermitted() {
        // business logic for user permission 
        if (!foodItem.isIsAvailable()) {
            return false;
        }
        Restro restro = new RestroSearcher().searchRestroById(foodItem.getRestroId());
        return this.deliveryManager.isDeliveryPossible(user.getAddress(), restro.getAddress());

    }
}
