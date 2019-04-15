package com.starbuzz;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (getSize() == Beverage.SMALL) {
            cost += 0.10;
        } else if (getSize() == Beverage.MEDIUM) {
            cost += 0.20;
        } else if (getSize() == Beverage.LARGE) {
            cost += 0.30;
        }

        return cost;
    }
}
