package com.scores;

public class Main {
    public static void main(String[] args) {
        Score score = new Score();
        score.addObserver(new Board());
        Web web = new Web();

        score.addObserver(web);
        score.setScore("Bulls", "Suns", 85, 86);

        score.removeObserver(web);
        score.setScore("Ginebra", "Purefoods", 54, 64);
    }
}
