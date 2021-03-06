package com.didispizza;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
