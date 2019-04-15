package com.scores;

import java.util.ArrayList;
import java.util.List;

public class Score implements Subject {
    private List observers;
    private String tan;
    private String tbn;
    private int tas;
    private int tbs;

    public Score() {
        observers = new ArrayList();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Object obj : observers) {
            Observer o = (Observer) obj;
            o.update(this.tan, this.tas, this.tbn, this.tbs);
        }
    }

    public void updateScores() {
        notifyObservers();
    }

    public void setScore(String an, String bn, int as, int bs) {
       this.tan = an;
       this.tbn = bn;
       this.tas = as;
       this.tbs = bs;
       updateScores();
    }
}
