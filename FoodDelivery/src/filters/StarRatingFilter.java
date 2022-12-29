/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import data.FoodItem;
import data.Restro;
import data.StarRating;

/**
 *
 * @author HP
 */
public class StarRatingFilter implements FoodItemFilter, RestroFilter {

    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getStarRating().getVal() >= starRating.getVal();
    }

    @Override
    public boolean filter(Restro restro) {
        return restro.getRating().getVal() >= starRating.getVal();
    }

}
