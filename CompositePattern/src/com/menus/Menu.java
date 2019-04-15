package com.menus;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }
    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
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
    public void print() {
        System.out.println("\n" + getName() + " - " + getDescription());
        System.out.println("---");

        for (Object object : menuComponents) {
            MenuComponent menuComponent = (MenuComponent) object;
            menuComponent.print();
        }
    }
}
