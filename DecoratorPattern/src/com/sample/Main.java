package com.sample;

public class Main {
    public static void main(String[] args) {
        IComponent component = new ConcreteComponent();

        component = new ConcreteDecorator(component);

        component.doOperation();
    }
}
