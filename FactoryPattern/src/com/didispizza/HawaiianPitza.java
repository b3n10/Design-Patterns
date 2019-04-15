package com.didispizza;

public class HawaiianPitza extends Pitza {
    PizzaIngredientFactory _pizzaIngredientFactory;

    public HawaiianPitza(PizzaIngredientFactory pizzaIngredientFactory) {
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
