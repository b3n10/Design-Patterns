package com.automatedhouse;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo _stereo) {
        stereo = _stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(12);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
