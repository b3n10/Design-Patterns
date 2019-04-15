package com.myshopping;

public class Item {
    private String item_name;
    private int amount;

    public Item(String item_name, int amount) {
        this.item_name = item_name;
        this.amount = amount;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getAmount() {
        return amount;
    }
}
