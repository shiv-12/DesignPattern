/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Map;
import managers.CardBasedPaymentManager;
import managers.NetBankingPaymentManager;
import managers.PaymentManager;

/**
 *
 * @author HP
 */
public class PaymentModeFactory {

    private PaymentModeFactory() {

    }

    public static PaymentManager getpaymentManager(String paymentMode, Map<String, String> paymentInfo) {

        if (paymentMode.equals("netbanking")) {
            return getNetbankingPayment(paymentInfo);
        } else if (paymentMode.equals("cardBased")) {
            return getCardBasedPayment(paymentInfo);
        } else {
            throw new RuntimeException("invalid payment mode");
        }

    }

    public static PaymentManager getCardBasedPayment(Map<String, String> paymentInfo) {
        PaymentManager paymentManager = new CardBasedPaymentManager(paymentInfo.get("bankName"), paymentInfo.get("cardNumber"), paymentInfo.get("pin"), Double.parseDouble(paymentInfo.get("amount")));
        return paymentManager;
    }

    private static PaymentManager getNetbankingPayment(Map<String, String> paymentInfo) {
        return new NetBankingPaymentManager(paymentInfo.get("bankName"), paymentInfo.get("userName"), paymentInfo.get("password"), paymentInfo.get("pin"), Double.parseDouble(paymentInfo.get("amount")));
    }

}
