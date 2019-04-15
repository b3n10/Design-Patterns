package com.automatedhouse;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo _stereo) {
        stereo = _stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
