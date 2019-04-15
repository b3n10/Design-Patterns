package com.starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend(int size) {
        this.description = "HouseBlend";
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
