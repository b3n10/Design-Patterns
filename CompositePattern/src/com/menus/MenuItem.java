package com.menus;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }
    @Override
    public void print() {
        System.out.print(getName() + ": " + getPrice() );
        if (isVegetarian()) {
            System.out.print("(v) ");
        }
        System.out.println("\n> " + getDescription());
    }
}
