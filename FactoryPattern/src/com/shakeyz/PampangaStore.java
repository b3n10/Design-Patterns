package com.shakeyz;

public class PampangaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("veggies")) {
            return new PampangaStyleVeggiePizza();
        } else if (type.equals("cheese")) {
            return new PampangaStyleCheesePizza();
        } else if (type.equals("beef")) {
            return new PampangaStyleBeefPizza();
        } else {
            return null;
        }
    }
}
