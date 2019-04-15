package com.resto;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuitems;

    public PancakeHouseMenu() {
        menuitems = new ArrayList<>();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuitems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return menuitems.iterator();
    }
}
