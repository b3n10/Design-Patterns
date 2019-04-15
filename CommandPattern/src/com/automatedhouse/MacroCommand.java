package com.automatedhouse;

import java.util.ArrayList;

public class MacroCommand implements Command {
    private ArrayList commands = new ArrayList();

    public MacroCommand(ArrayList _commands) {
        commands = _commands;
    }

    @Override
    public void execute() {
        for (Object object : commands) {
            Command command = (Command) object;
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Object object : commands) {
            Command command = (Command) object;
            command.undo();
        }
    }
}
