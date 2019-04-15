package com.resto;

import java.util.ArrayList;

public class MenuTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.addItem("Donut", "Sweet donut", false, 12.30);

        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem("Munggo", "Manyaman ini", true, 10.25);

        CafeMenu cafeMenu = new CafeMenu();
        cafeMenu.addItems("kopi", "gatas na kape", false, 2.30);

        ArrayList<Menu> arrayList = new ArrayList<>();
        arrayList.add(pancakeHouseMenu);
        arrayList.add(dinerMenu);
        arrayList.add(cafeMenu);

        // Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        // waitress.printMenu();

        Waitress waitress = new Waitress(arrayList);
        waitress.printMenua();
    }
}
