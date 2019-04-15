package com.didispizza;

public class PampangaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new SpicySauce();
    }

    @Override
    public Cheese createCheese() {
        return new CarrotCheese();
    }

    @Override
    public Veggies createVeggies() {
        return new SaltyVeggies();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new FatPepperoni();
    }

    @Override
    public Clam createClam() {
        return new ChubbyClam();
    }
}
