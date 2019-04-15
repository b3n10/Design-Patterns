package com.starbuzz;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (getSize() == Beverage.SMALL) {
            cost += 0.15;
        } else if (getSize() == Beverage.MEDIUM) {
            cost += 0.25;
        } else if (getSize() == Beverage.LARGE) {
            cost += 0.35;
        }

        return cost;
    }
}
