/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import data.PaymentResponse;

/**
 *
 * @author HP
 */
public class CardBasedPaymentManager implements PaymentManager {

    private final String bankName;
    private final String cardNumber;
    private final String pin;
    private final double amount;

    public CardBasedPaymentManager(String bankName, String cardNumber, String pin, double amount) {
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.amount = amount;
    }

    @Override
    public PaymentResponse executePayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
