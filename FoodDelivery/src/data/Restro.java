/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

/**
 *
 * @author HP
 */
public class Restro {

    private final int restroId;
    private final String restroName;
    private final MealType mealType;
    private final List<CuisineType> cuisineTypeList;
    private final StarRating rating;

    private final BusinessHours bussinessHours;
    private final Menu menu;
    private final Address address;

    public Restro(int restroId, String restroName, MealType mealType, List<CuisineType> cuisineTypeList, StarRating rating, BusinessHours bussinessHours, Menu menu, Address address) {
        this.restroId = restroId;
        this.restroName = restroName;
        this.mealType = mealType;
        this.cuisineTypeList = cuisineTypeList;
        this.rating = rating;
        this.bussinessHours = bussinessHours;
        this.menu = menu;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public int getRestroId() {
        return restroId;
    }

    public String getRestroName() {
        return restroName;
    }

    public MealType getMealType() {
        return mealType;
    }

    public List<CuisineType> getCuisineTypeList() {
        return cuisineTypeList;
    }

    public StarRating getRating() {
        return rating;
    }

    public BusinessHours getBussinessHours() {
        return bussinessHours;
    }

    public Menu getMenu() {
        return menu;
    }

   

}
