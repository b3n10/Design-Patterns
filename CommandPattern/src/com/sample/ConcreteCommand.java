package com.sample;

public class ConcreteCommand implements Command {
    Receiver receiver;

    public ConcreteCommand(Receiver _receiver) {
        receiver = _receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
