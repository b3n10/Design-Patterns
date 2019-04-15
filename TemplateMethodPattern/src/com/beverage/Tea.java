package com.beverage;

public class Tea extends DrinkBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Tea is not needing condiments.");
    }

    @Override
    protected void boilWater() {
        System.out.println("Hot tea with boiling water.");
    }
}
