/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import Factory.PaymentModeFactory;
import data.PaymentResponse;
import data.PaymentStatus;
import data.User;
import java.util.Map;
import data.Order;
import managers.OrderManager;
import managers.PaymentManager;
import managers.UserManager;

public class PlaceOrderApi {

    private final UserManager userManager = new UserManager();
    private final OrderManager orderManager = new OrderManager();

    public Order placeOrder(String userToken, Map<String, String> paymentInfo, String paymentMode) {
        if (userToken.length() == 0 || userToken == null) {
            throw new IllegalArgumentException("params missing");
        }
        User user = userManager.getUserByToken(userToken);
        if (user == null) {
            throw new IllegalArgumentException("token invalid");
        }

        // now we want payment processed sucessfully
        // here diffrent modes of payment 
        // create interface because there are lots of payment modes called PaymentManager Interface
        // ab hume right type ki payment mode manager ki jaruar hongi 
        // if(paymentMode == "netBanking") esa kr ke multiple payment modes likh skte hai yaa hum factory bana skte hai 
        PaymentManager paymentManager = PaymentModeFactory.getpaymentManager(paymentMode, paymentInfo);
        PaymentResponse paymentResponse = paymentManager.executePayment();
        if (paymentResponse == null || paymentResponse.getPaymentStatus() == null || paymentResponse.getPaymentStatus().equals(PaymentStatus.FAILED)) {
            throw new RuntimeException("payment failed...");
        }
        // Now we need to create an class which manages order 

        return orderManager.placeOrder(user);

    }

}
