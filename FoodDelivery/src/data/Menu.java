/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
class Menu {

    private final List<FoodItem> foodItemList;

    public Menu(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public List<FoodItem> getFoodItemList() {
        return foodItemList;
    }

}
