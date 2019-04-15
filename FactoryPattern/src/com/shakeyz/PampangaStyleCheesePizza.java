package com.shakeyz;

public class PampangaStyleCheesePizza extends Pizza {
    public PampangaStyleCheesePizza() {
        name = "Pampanga Style Cheese Pizza";
        dough = "thick crust";
        toppings.add("Onions");
    }

    @Override
    void cut() {
        System.out.println("Cutting pizza into squares..");
    }
}
