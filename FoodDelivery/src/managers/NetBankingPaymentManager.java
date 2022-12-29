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
public class NetBankingPaymentManager implements PaymentManager {

    private final String bankName;
    private final String userName;
    private final String password;
    private final String pin;
    private final double amount;

    // yeh saara data map mai paas honga yadi hum chahte hai ki constructor mai kuch cheeje optional ho then 
    // we need to store  builder pattern
    public NetBankingPaymentManager(String bankName, String userName, String password, String pin, double amount) {
        this.bankName = bankName;
        this.userName = userName;
        this.password = password;
        this.pin = pin;
        this.amount = amount;
    }

    @Override
    public PaymentResponse executePayment() {

    }

}
