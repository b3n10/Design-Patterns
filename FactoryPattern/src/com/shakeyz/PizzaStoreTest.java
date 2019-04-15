package com.shakeyz;

public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaStore pampangaStore = new PampangaStore();
        Pizza pizza = pampangaStore.orderPizza("cheese");
        System.out.println("Ethan ordered " + pizza.getName() + "!");
    }
}
