/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import data.FoodItem;
import data.Order;
import data.OrderStatus;
import data.User;
import permission.AddToCartPermission;
import permission.CheckOutCartPermission;
import permission.DeleteFromCartPermission;
import permission.Permission;
import permission.PlaceOrderPermission;
import permission.UpdateOrderPermision;

/**
 *
 * @author HP
 */
public class PermissionFactory {

    private PermissionFactory() {
    }

    public static Permission getAddToCartPermission(User user, FoodItem foodItem) {
        return new AddToCartPermission(user, foodItem);
    }

    public static Permission getDeleteFromCartPermission(User user, FoodItem foodItem) {
        return new DeleteFromCartPermission(user, foodItem);
    }

    public static Permission getCheckoutCartPermission(User user) {
        return new CheckOutCartPermission(user);
    }

    public static Permission getPlaceOrderPermission(User user) {
        return new PlaceOrderPermission(user);
    }

    public static Permission getUpdateOrderPermission(User user, Order order, OrderStatus orderStatus) {
        return new UpdateOrderPermision(user, order, orderStatus);
    }
}
