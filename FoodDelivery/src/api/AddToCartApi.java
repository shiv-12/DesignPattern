/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import Searcher.FoodItemSearcher;
import data.FoodItem;
import data.User;
import java.util.List;
import managers.CartManager;
import managers.UserManager;

/**
 *
 * @author HP
 */
public class AddToCartApi {

    private final UserManager userManager = new UserManager();
    private final FoodItemSearcher foodItemSearcher = new FoodItemSearcher();

    public void addToCart(String userToken, int foodItemId) {
        // validate user
        User user = userManager.getUserByToken(userToken);
        if (user == null) {
            // throw some exception
        }

        FoodItem foodItem = foodItemSearcher.searchFoodIteamById(foodItemId);
        if (foodItem == null) {
            // throw some exception
        }

        new CartManager().addItemToCart(user, foodItem);

    }
}
