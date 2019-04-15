package com.didispizza;

public class BulacanPitzaStore extends PitzaStore {
    @Override
    Pitza createPitza(String item) {
        Pitza pitza = null;
        PizzaIngredientFactory bulacanPizzaIngredientFactory = new BulacanPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pitza = new CheesePizza(bulacanPizzaIngredientFactory);
            pitza.setName("Bulacan Style Cheese Pizza");
        } else if (item.equals("hawaiian")) {
            pitza = new HawaiianPitza(bulacanPizzaIngredientFactory);
            pitza.setName("Bulacan Style Hawaiian Pizza");
        }

        return pitza;
    }
}
