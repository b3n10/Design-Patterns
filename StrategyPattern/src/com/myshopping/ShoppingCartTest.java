package com.myshopping;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item i1 = new Item("shoes", 100);
        Item i2 = new Item("shirt", 60);
        Item i3 = new Item("hankeys", 20);

        cart.addItem(i1);
        cart.addItem(i2);
        cart.addItem(i3);
        cart.removeItem(i2);

        cart.pay(new PayPal("ben@email.com", "er34er"));
    }
}
