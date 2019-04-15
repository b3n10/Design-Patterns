package com.sample;

public class Context {
    IStrategy iStrategy;

    void doStrategy(IStrategy _iStrategy) {
        _iStrategy.doOperation();
    }
}
