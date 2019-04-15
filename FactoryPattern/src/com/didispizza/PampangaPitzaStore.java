package com.didispizza;

public class PampangaPitzaStore extends PitzaStore {
    @Override
    Pitza createPitza(String item) {
        Pitza pitza = null;
        PizzaIngredientFactory pampangaPizzaIngredientFactory = new PampangaPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pitza = new CheesePizza(pampangaPizzaIngredientFactory);
            pitza.setName("Pampanga Style Cheese Pizza");
        } else if (item.equals("hawaiian")) {
            pitza = new HawaiianPitza(pampangaPizzaIngredientFactory);
            pitza.setName("Pampanga Style Hawaiian Pizza");
        }

        return pitza;
    }
}
