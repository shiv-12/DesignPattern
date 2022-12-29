/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searcher;

import dataaccessor.DataAccessResultObjectConvertor;
import data.FoodItem;
import dataaccessor.DataAccessResult;
import dataaccessor.DataAccessor;
import filters.FoodItemFilter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class FoodItemSearcher {

    public List<FoodItem> search(String foodName, List<FoodItemFilter> filters) {

        if (foodName == null || foodName.length() == 0 || filters.size() == 0) {
            throw new IllegalArgumentException("missing params");
        }
        DataAccessResult dataAccessResult = DataAccessor.getFoodItemsWithNames(foodName);
        List<FoodItem> listOfFoodItems = DataAccessResultObjectConvertor.convertFoodItems(dataAccessResult);

        for (FoodItemFilter filter : filters) {

            List<FoodItem> filteredFoodItems = new ArrayList<>();
            for (FoodItem foodItem : listOfFoodItems) {
                if (filter.filter(foodItem)) {
                    filteredFoodItems.add(foodItem);
                }
            }
            listOfFoodItems = filteredFoodItems;
        }

        return listOfFoodItems;
    }

    public FoodItem searchFoodIteamById(int id) {
        DataAccessResult dataAccessResult = DataAccessor.getFoodItemById(id);
        FoodItem foodItem = DataAccessResultObjectConvertor.convertToFoodItem(dataAccessResult);
        return foodItem;
    }

}
