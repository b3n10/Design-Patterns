package com.animals;

abstract class Dog {
    protected RunBehavior r;
    protected GrowlBehavior g;

    void performRun() {
        r.run();
    }

    void performGrowl() {
        g.growl();
    }

    void setGrowlBehavior(GrowlBehavior gb) {
        g = gb;
    }

    void setRunBehavior(RunBehavior rb) {
        r = rb;
    }

    abstract void sleep();
}
