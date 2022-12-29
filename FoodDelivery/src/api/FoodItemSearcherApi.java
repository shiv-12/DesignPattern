/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import Searcher.FoodItemSearcher;
import data.CuisineType;
import data.FoodItem;
import data.MealType;
import data.StarRating;
import filters.CuisineTypeFilter;
import filters.FoodItemFilter;
import filters.MealTypeFilter;
import filters.StarRatingFilter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class FoodItemSearcherApi {

    public List<FoodItem> searchFoodItems(String foodItemName, MealType mealType, List<CuisineType> cuisineTypeList, StarRating rating) {

        List<FoodItemFilter> filter = new ArrayList<>();
        filter.add(new MealTypeFilter(mealType));
        filter.add(new CuisineTypeFilter(cuisineTypeList));
        filter.add(new StarRatingFilter(rating));

        return new FoodItemSearcher().search(foodItemName, filter);
    }

}
