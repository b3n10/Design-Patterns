package com.sample;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.doStrategy(new StrategyA());
        context.doStrategy(new StrategyB());
    }
}
