package com.myshopping;

public class CreditCard implements PaymentStrategy {
    private String cardholder_name;
    private int card_number;
    private int expiration_date;

    public CreditCard(String cardholder_name, int card_number, int expiration_date) {
        this.cardholder_name = cardholder_name;
        this.card_number = card_number;
        this.expiration_date = expiration_date;
    }

    @Override
    public String payMethod() {
        return "Paying via cc";
    }
}
