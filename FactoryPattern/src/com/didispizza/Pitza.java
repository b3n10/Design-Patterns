package com.didispizza;

public abstract class Pitza {
    String name;
    Dough dough;
    Cheese cheese;
    Sauce sauce;
    Veggies veggies;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Now baking pizza in 250deg..");
    }

    void cut() {
        System.out.println("Cutting pizza into square slices..");
    }

    void box() {
        System.out.println("Placing pizza into official PizzaStore box..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
