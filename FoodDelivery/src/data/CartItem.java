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
public class CartItem {

    private final FoodItem foodItem;
    private final int qty;

    public CartItem(FoodItem foodItem, int qty) {
        this.foodItem = foodItem;
        this.qty = qty;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public int getQty() {
        return qty;
    }

}
