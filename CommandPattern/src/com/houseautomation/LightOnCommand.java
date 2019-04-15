package com.houseautomation;

public class LightOnCommand implements Command {
    private Light _light;

    public LightOnCommand(Light light) {
        _light = light;
    }

    @Override
    public void execute() {
        _light.on();
    }
}
