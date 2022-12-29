/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import data.FoodItem;
import data.MealType;
import data.Restro;

/**
 *
 * @author HP
 */
public class MealTypeFilter implements FoodItemFilter, RestroFilter {

    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType().equals(this.mealType);
    }

    @Override
    public boolean filter(Restro restro) {
        return restro.getMealType().equals(this.mealType);
    }

}
