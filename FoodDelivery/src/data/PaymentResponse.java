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
public class PaymentResponse {

    private final int paymentId;
    private final PaymentStatus paymentStatus;
    private final double amount;

    public PaymentResponse(int paymentId, PaymentStatus paymentStatus, double amount) {
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

}
