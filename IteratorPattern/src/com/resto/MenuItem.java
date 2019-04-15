package com.resto;

public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String _name, String _description, boolean _vegetarian, double _price) {
        name = _name;
        description = _description;
        vegetarian = _vegetarian;
        price = _price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
