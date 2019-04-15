package com.scores;

public interface Observer {
    void update(String teamA_name, int teamA_score, String teamB_name, int teamB_score);
}
