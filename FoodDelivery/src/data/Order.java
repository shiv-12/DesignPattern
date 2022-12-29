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
public class Order {

    // what foodItems present in a order also the quntity of each product 
    // List of cartItem
    private final List<CartItem> cartItems;
    private final int orderId;
    private final int userId;
    private final OrderStatus orderStatus;

    public Order(List<CartItem> cartItems, int orderId, int userId, OrderStatus orderStatus) {
        this.cartItems = cartItems;
        this.orderId = orderId;
        this.userId = userId;
        this.orderStatus = orderStatus;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

}
