package com.resto;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new Hashtable<>();
    }

    public void addItems(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
