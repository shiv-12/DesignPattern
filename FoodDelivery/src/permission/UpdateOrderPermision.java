/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permission;

import data.Order;
import data.OrderStatus;
import data.User;

/**
 *
 * @author HP
 */
public class UpdateOrderPermision implements Permission {

    private final User user;
    private final Order order;
    private final OrderStatus orderStatus;      // this is the new status of users order 

    public UpdateOrderPermision(User user, Order order, OrderStatus orderStatus) {
        this.user = user;
        this.order = order;
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean isPermitted() {

        // all the business logic present here like if the user is the owner of restro then they will able to change the status from OrderPlaced to Cooking 
        return false;
    }

}
