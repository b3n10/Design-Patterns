package com.resto;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;
    private ArrayList arrayList;

    public Waitress(Menu _pancakeHouseMenu, Menu _dinerMenu, CafeMenu _cafeMenu) {
        pancakeHouseMenu = _pancakeHouseMenu;
        dinerMenu = _dinerMenu;
        cafeMenu = _cafeMenu;
    }

    public Waitress(ArrayList _arrayList) {
        arrayList = _arrayList;
    }

    public void printMenu() {
        System.out.println("MENU\n---");

        System.out.println("BREAKFAST");
        loopMenu(pancakeHouseMenu.createIterator());

        System.out.println("\nLUNCH");
        loopMenu(dinerMenu.createIterator());

        System.out.println("\nKAFE:");
        loopMenu(cafeMenu.createIterator());
    }

    public void printMenua() {
        for (Object object : arrayList.toArray()) {
            Menu menu = (Menu) object;
           loopMenu(menu.createIterator());
        }
    }

    public void loopMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " (" + menuItem.getPrice() + ") - " + menuItem.getDescription());
        }
    }
}
