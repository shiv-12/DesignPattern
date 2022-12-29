/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import Searcher.RestroSearcher;
import data.CuisineType;
import data.MealType;
import data.Restro;
import data.StarRating;
import filters.CuisineTypeFilter;
import filters.MealTypeFilter;
import filters.RestroFilter;
import filters.StarRatingFilter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class RestroSearcherApi {

    public List<Restro> searchResto(String restroName, MealType mealType, List<CuisineType> cuisineTypeList, StarRating rating) {
        // validate all the parameters first
        // objects ka varlidation check krne ke liye null aur empty check kr skte hai 
        List<RestroFilter> filters = new ArrayList<>();
        filters.add(new MealTypeFilter(mealType));
        filters.add(new CuisineTypeFilter(cuisineTypeList));
        filters.add(new StarRatingFilter(rating));

        return new RestroSearcher().search(restroName, filters);
    }

}
