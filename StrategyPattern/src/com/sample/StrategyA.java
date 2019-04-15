package com.sample;

public class StrategyA implements IStrategy {
    @Override
    public void doOperation() {
        System.out.println("I'm doing strategy A.");
    }
}
