package com.automatedhouse;

public class LightOffCommand implements Command {
    private BrightLight _brightLight;

    public LightOffCommand(BrightLight brightLight) {
        _brightLight = brightLight;
    }

    @Override
    public void execute() {
        _brightLight.off();
    }

    @Override
    public void undo() {
       _brightLight.on();
    }
}
