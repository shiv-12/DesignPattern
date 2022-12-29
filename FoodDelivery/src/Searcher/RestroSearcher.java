/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searcher;

import dataaccessor.DataAccessResultObjectConvertor;
import data.FoodItem;
import data.Restro;
import filters.RestroFilter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class RestroSearcher {

    public List<Restro> search(String restroName, List<RestroFilter> filters) {
        DataAccessResult dataAccessResult = DbAccessor.getAllRestoWithNames(restroName);
        List<Restro> listOfRestro = DataAccessResultObjectConvertor.convertFoodItems(dataAccessResult);

        for (RestroFilter filterArgs : filters) {
            List<Restro> filterResult = new ArrayList<>();
            for (Restro restro : listOfRestro) {
                if (filterArgs.filter(restro)) {
                    filterResult.add(restro);
                }
            }
            listOfRestro = filterResult;

        }
        return listOfRestro;
    }

    public Restro searchRestroById(int id) {
        DataAccessResult dataAccessResult = DBAccessor.getFoodItemById(id);
        Restro restro = DataAccessResultObjectConvertor.convertToFoodItem(dataAccessResult);
        return restro;

    }
}
