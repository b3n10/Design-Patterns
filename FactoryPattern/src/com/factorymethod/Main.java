package com.factorymethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Product product = factory.createProduct("producta");
        product.method();

        product = factory.createProduct("productb");
        product.method();
    }
}
