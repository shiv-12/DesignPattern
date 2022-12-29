/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import Factory.PermissionFactory;
import data.CartItem;
import data.Order;
import data.OrderStatus;
import data.User;
import dataaccessor.DataAccessor;
import java.util.List;
import permission.Permission;

/**
 *
 * @author HP
 */
public class OrderManager {

    public Order placeOrder(User user) {
        // first we need to validate the permissions and for permission we need PermissionFactory

        Permission permission = PermissionFactory.getPlaceOrderPermission(user);
        if (!permission.isPermitted()) {
            throw new RuntimeException("permission denied");
        }
        //now cart table mai rakhe saare products ko checkout mark kr diya jaayega 
        CartManager cartManager = new CartManager();// isse isliye local level per banaya hai instance isliye nahi q ki other methods mai nahi use honga hai 
        List<CartItem> cartItems = cartManager.getUserCart(user);
        int orderId = DataAccessor.createOrder(user, cartItems);
        // now checkout to cart
        cartManager.checkOutUserCart(user);

        return new Order(cartItems, orderId, user.getUserid(), OrderStatus.ORDER_PLACED);
    }

    public List<Order> getOrders(User user) {
        return null;
    }

    public Order getOrder(int orderId) {
        return null;
    }

    // saari semiler kinds of methods mai permission wali cheej toh hongi hi 
    public void setOrderToCooking(User user, Order order) {
        Permission permission = PermissionFactory.getUpdateOrderPermission(user, order, OrderStatus.COOKING);
        if (!permission.isPermitted()) {
            throw new RuntimeException("permission denied");
        }
        // checking order status should changed in the sequence
        if (!order.getOrderStatus().equals(OrderStatus.ORDER_PLACED)) {
            throw new RuntimeException("only order place items can move to cooking");
        }
// logic for update the status of the order inside the db
        DataAccessor.updateOrderStatus(order.getOrderId(), OrderStatus.COOKING);
    }

    public void setOrderToReadyForDelivery(User user, Order order) {
        // aprat from user permission
        // checking order status should changed in the sequence
        if (!order.getOrderStatus().equals(OrderStatus.COOKING)) {
            throw new RuntimeException("");
        }
// logic for update the status of the order inside the db
        DataAccessor.updateOrderStatus(order.getOrderId(), OrderStatus.READY_FOR_DELIVERY);
    }

    public void setOrderToOutForDelivery(User user, Order order) {
        // aprat from user permission
        // checking order status should changed in the sequence
        if (!order.getOrderStatus().equals(OrderStatus.READY_FOR_DELIVERY)) {
            throw new RuntimeException("");
        }
// logic for update the status of the order inside the db
        DataAccessor.updateOrderStatus(order.getOrderId(), OrderStatus.OUT_FOR_DELIVERY);
    }

    public void setOrderToDelivered(User user, Order order) {
        // aprat from user permission
        // checking order status should changed in the sequence
        if (!order.getOrderStatus().equals(OrderStatus.OUT_FOR_DELIVERY)) {
            throw new RuntimeException("");
        }
// logic for update the status of the order inside the db
        DataAccessor.updateOrderStatus(order.getOrderId(), OrderStatus.DELIVERED);
    }

    public void setOrderToCanceled(User user, Order order) {
        // aprat from user permission
        // checking order status should changed in the sequence
        if (!order.getOrderStatus().equals(OrderStatus.ORDER_PLACED)) {
            throw new RuntimeException("");
        }
// logic for update the status of the order inside the db
        DataAccessor.updateOrderStatus(order.getOrderId(), OrderStatus.CANCELED);
    }

}

//i dont like this nested if checks in all the methods 
//yadi 100 stats ho then what ?
//the way to get out of it is beautiful design pattern called stateDesign pattern 

