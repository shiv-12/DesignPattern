/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import data.CuisineType;
import data.FoodItem;
import data.Restro;
import java.util.List;

/**
 *
 * @author HP
 */
public class CuisineTypeFilter implements FoodItemFilter, RestroFilter {

    private final List<CuisineType> cuisineType;    // let say user can provide two cuisines

    public CuisineTypeFilter(List<CuisineType> cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return cuisineType.contains(foodItem.getCuisineType());
    }

    @Override
    public boolean filter(Restro restro) {          // restro has 10 cusines then restro mai koi ek bhi user ki psnd ki cuisine milti hai then return true 
        for (CuisineType userCuisine : this.cuisineType) {
            return restro.getCuisineTypeList().contains(userCuisine);
        }
        return false;
    }

}
