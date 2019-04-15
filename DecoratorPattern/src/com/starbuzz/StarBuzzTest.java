package com.starbuzz;

public class StarBuzzTest {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso(Beverage.LARGE);

        Beverage beverage1a = new Mocha(beverage1);
        Beverage beverage1b = new Mocha(beverage1a);
        Beverage beverage1c = new Whip(beverage1b);

        Beverage beverage2 = new HouseBlend(Beverage.MEDIUM);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage1c.getDescription() + ": " + beverage1c.cost());
        System.out.println(beverage2.getDescription() + ": " + beverage2.cost());
    }
}
