package com.shakeyz;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing pizza: " + getName());
        System.out.println("Tossing dough: " + getDough());
        System.out.println("Adding toppings: " + getToppings());
    }

    void bake() {
        System.out.println("Baking pizza..");
    }

    void cut() {
        System.out.println("Cutting pizza..");
    }

    void box() {
        System.out.println("Now putting pizza in official store box..");
    }

    String getName() {
        return name;
    }

    String getDough() {
        return dough;
    }

    ArrayList getToppings() {
        return toppings;
    }
}
