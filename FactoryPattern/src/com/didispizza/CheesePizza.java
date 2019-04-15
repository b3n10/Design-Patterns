package com.didispizza;

public class CheesePizza extends Pitza {
    PizzaIngredientFactory _pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        _pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + getName());
        dough = _pizzaIngredientFactory.createDough();
        cheese = _pizzaIngredientFactory.createCheese();
        sauce = _pizzaIngredientFactory.createSauce();
        veggies = _pizzaIngredientFactory.createVeggies();
        pepperoni = _pizzaIngredientFactory.createPepperoni();
        clam = _pizzaIngredientFactory.createClam();
    }
}
