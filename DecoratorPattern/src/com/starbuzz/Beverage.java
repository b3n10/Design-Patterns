package com.starbuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";

    int size = 0;
    static final int SMALL = 0;
    static final int MEDIUM = 1;
    static final int LARGE = 2;

    public abstract int getSize();

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
