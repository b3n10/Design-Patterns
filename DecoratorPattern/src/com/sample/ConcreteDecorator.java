package com.sample;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(IComponent _iComponent) {
        iComponent = _iComponent;
    }

    @Override
    public void doOperation() {
        iComponent.doOperation();
        System.out.println("ConcreteDecorator.doOperation() invoked..");
    }
}
