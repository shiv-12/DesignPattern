/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import data.FoodItem;

/**
 *
 * @author HP
 */
public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}
