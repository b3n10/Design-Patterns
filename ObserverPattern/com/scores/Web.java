package com.scores;

public class Web implements Observer {
    @Override
    public void update(String teamA_name, int teamA_score, String teamB_name, int teamB_score) {
        System.out.println("--Web--");
        System.out.println(teamA_name + ": " + teamA_score);
        System.out.println(teamB_name + ": " + teamB_score);
    }
}