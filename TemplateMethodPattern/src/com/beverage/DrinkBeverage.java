package com.beverage;

public abstract class DrinkBeverage {
    final void prepareRecipe() {
        boilWater();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        stir();
    }

    protected abstract void addCondiments();

    protected abstract void boilWater();

    private void stir() {
    }

    protected boolean customerWantsCondiments() {
        return false;
    }
}
