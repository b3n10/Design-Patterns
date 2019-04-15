package com.myshopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List items;

    public ShoppingCart() {
        items = new ArrayList();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int total_amount = 0;
        List<String> all_items = new ArrayList<String>();

        for (Object o : items) {
            Item item = (Item) o;
            all_items.add(item.getItem_name());
            total_amount += item.getAmount();
        }

        System.out.println("Items: " + all_items);
        System.out.println("Total: " + total_amount);
        System.out.println(paymentStrategy.payMethod());
    }
}
