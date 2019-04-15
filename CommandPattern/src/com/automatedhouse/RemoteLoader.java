package com.automatedhouse;

import java.util.ArrayList;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        BrightLight kitchen = new BrightLight("Kitchen");
        BrightLight livingRoom = new BrightLight("Living Room");
        Stereo livingRoomStereo = new Stereo("Living Room");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchen);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchen);

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoom);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoom);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(livingRoomStereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

/*        remoteControl.setCommands(kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommands(livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommands(stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommands(ceilingFanHighCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.pressOnButton(0);
        remoteControl.pressOnButton(2);
        remoteControl.pressOffButton(0);
        remoteControl.pressUndoButton();
        remoteControl.pressOnButton(1);
        remoteControl.pressUndoButton();
        remoteControl.pressOffButton(2);
        remoteControl.pressOnButton(3);
        remoteControl.pressUndoButton();*/

        ArrayList onCommands = new ArrayList();
        onCommands.add(livingRoomLightOnCommand);
        onCommands.add(kitchenLightOnCommand);
        onCommands.add(stereoOnWithCDCommand);
        onCommands.add(ceilingFanHighCommand);

        ArrayList offCommands = new ArrayList();
        offCommands.add(livingRoomLightOffCommand);
        offCommands.add(kitchenLightOffCommand);
        offCommands.add(stereoOffCommand);
        offCommands.add(ceilingFanOffCommand);

        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);

        remoteControl.setCommands(macroOnCommand, macroOffCommand);

        remoteControl.pressOnButton(0);
        System.out.println(remoteControl);
        remoteControl.pressOffButton(0);
        System.out.println("\n--undo--\n");
        remoteControl.pressUndoButton();
    }
}
