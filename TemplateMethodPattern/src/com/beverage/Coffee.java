package com.beverage;

public class Coffee extends DrinkBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("I want coffee with sugar.");
    }

    @Override
    protected void boilWater() {
        System.out.println("Coffee now boiling water.");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return true;
    }
}
