package com.sample;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        invoker.setCommand(concreteCommand);
        invoker.callCommand();
    }
}
