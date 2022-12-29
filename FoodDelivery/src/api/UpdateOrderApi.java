/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import data.Order;
import data.OrderStatus;
import data.User;
import managers.OrderManager;
import managers.UserManager;

/**
 *
 * @author HP
 */
public class UpdateOrderApi {

    OrderManager orderManager = new OrderManager();
    UserManager userManager = new UserManager();

    public void updateOrder(int orderId, OrderStatus orderStatus, String userToken) {
        // validate agruments 
        User user = userManager.getUserByToken(userToken);
        Order order = orderManager.getOrder(orderId);

        if (orderStatus.equals(OrderStatus.COOKING)) {
            orderManager.setOrderToCooking(user, order);
        }
    }

}
