package com.sample;

public class Invoker {
    Command command;

    void setCommand(Command _command) {
        command = _command;
    }

    void callCommand() {
        command.execute();
    }
}
