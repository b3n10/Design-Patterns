package com.abstractfactory;

public class Main {
    public static void main(String[] args) {
        ConcreteFactoryA concreteFactoryA = new ConcreteFactoryA();

        AbstractProductA abstractProductA = concreteFactoryA.createProductA();
        abstractProductA.method();

        AbstractProductB abstractProductB = concreteFactoryA.createProductB();
        abstractProductB.method();
    }
}
