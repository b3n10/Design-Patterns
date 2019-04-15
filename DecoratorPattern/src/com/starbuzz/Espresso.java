package com.starbuzz;

public class Espresso extends Beverage {
    public Espresso(int size) {
        this.description = "Espresso";
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
