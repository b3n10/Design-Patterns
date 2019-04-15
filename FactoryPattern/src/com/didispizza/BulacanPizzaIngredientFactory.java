package com.didispizza;

public class BulacanPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new DunkinDough();
    }

    @Override
    public Sauce createSauce() {
        return new SaudiSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RatCheese();
    }

    @Override
    public Veggies createVeggies() {
        return new SanMateoVeggies();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new KabotePepperoni();
    }

    @Override
    public Clam createClam() {
        return new BambooClam();
    }
}
