package com.automatedhouse;

public class LightOnCommand implements Command {
    private BrightLight _brightLight;

    public LightOnCommand(BrightLight brightLight) {
        _brightLight = brightLight;
    }

    @Override
    public void execute() {
       _brightLight.on();
    }

    @Override
    public void undo() {
        _brightLight.off();
    }
}
