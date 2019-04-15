package com.houseautomation;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor _garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        _garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        _garageDoor.up();
        _garageDoor.stop();
        _garageDoor.lightOn();
    }
}
