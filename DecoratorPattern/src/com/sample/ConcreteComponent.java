package com.sample;

public class ConcreteComponent implements IComponent {
    @Override
    public void doOperation() {
        System.out.println("ConcreteComponent.doOperation() invoked..");
    }
}
