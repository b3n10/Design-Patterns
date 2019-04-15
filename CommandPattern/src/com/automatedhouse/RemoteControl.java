package com.automatedhouse;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList onCommands;
    private ArrayList offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new ArrayList();
        offCommands = new ArrayList();
    }

    public void setCommands(Command onCommand, Command offCommand) {
        onCommands.add(onCommand);
        offCommands.add(offCommand);
    }

    public void pressOnButton(int slotIndex) {
        Command _onCommand = (Command) onCommands.get(slotIndex);
        _onCommand.execute();
        undoCommand = (Command) onCommands.get(slotIndex);
    }

    public void pressOffButton(int slotIndex) {
        Command _offCommand = (Command) offCommands.get(slotIndex);
        _offCommand.execute();
        undoCommand = (Command) offCommands.get(slotIndex);
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }


    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("---Slots in the Remote Control--\n");
        stringBuffer.append("On Commands:\n");

        int i = 0;
        for (Object _command : onCommands.toArray()) {
            Command command = (Command) _command;
            stringBuffer.append(i + ": " + command.getClass() + ".\n");
            i++;
        }

        stringBuffer.append("Off Commands:\n");
        i = 0;
        for (Object _command : offCommands.toArray()) {
            Command command = (Command) _command;
            stringBuffer.append(i + ": " + command.getClass() + ".\n");
            i++;
        }

        return stringBuffer.toString();
    }
}
