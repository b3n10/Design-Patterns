package com.hometheater;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    TheatherLights theatherLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier _amplifier, DvdPlayer _dvdPlayer, TheatherLights _theatherLights, Screen _screen, PopcornPopper _popcornPopper) {
        amplifier = _amplifier;
        dvdPlayer = _dvdPlayer;
        theatherLights = _theatherLights;
        screen = _screen;
        popcornPopper = _popcornPopper;
    }

    public void watchMovie() {
        System.out.println("Movie time..");
        popcornPopper.on();
        popcornPopper.pop();
        theatherLights.dim();
        screen.down();
        amplifier.on();
        amplifier.setVolume(6);
        dvdPlayer.on();
        dvdPlayer.play("Dunkirk");
    }

    public void endMovie() {
        System.out.println("Closing time..");
        popcornPopper.off();
        theatherLights.on();
        screen.up();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
