package com.sample;

public abstract class Decorator implements IComponent {
    IComponent iComponent;

    public abstract void doOperation();
}
