/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import Searcher.FoodItemSearcher;
import data.FoodItem;

/**
 *
 * @author HP
 */
public class GetFoodItemByIdApi {

    public FoodItem getRestroById(int foodItemId) {
        return new FoodItemSearcher().searchFoodIteamById(foodItemId);
    }

}
