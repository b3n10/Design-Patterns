package com.myshopping;

public class PayPal implements PaymentStrategy {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String payMethod() {
        return "I'm paying via paypal.";
    }
}
