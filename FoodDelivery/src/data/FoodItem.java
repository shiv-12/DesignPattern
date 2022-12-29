/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author HP
 */
public class FoodItem {

    private final int foodItemId;
    private final int restroId;
    private final String foodName;
    private final String foodDesc;
    private final double foodPrice;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating starRating;
    private final boolean isAvailable;

    public FoodItem(int foodItemId, int restroId, String foodName, String foodDesc, double foodPrice, MealType mealType, CuisineType cuisineType, StarRating starRating, boolean isAvailable) {
        this.foodItemId = foodItemId;
        this.restroId = restroId;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
        this.foodPrice = foodPrice;
        this.mealType = mealType;
        this.cuisineType = cuisineType;
        this.starRating = starRating;
        this.isAvailable = isAvailable;
    }

    public int getFoodItemId() {
        return foodItemId;
    }

    public int getRestroId() {
        return restroId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public MealType getMealType() {
        return mealType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

}
