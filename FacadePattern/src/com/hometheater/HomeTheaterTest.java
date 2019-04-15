package com.hometheater;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        TheatherLights theatherLights = new TheatherLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, theatherLights, screen, popcornPopper);

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
