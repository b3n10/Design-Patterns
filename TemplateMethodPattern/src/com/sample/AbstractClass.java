package com.sample;

public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        if (hook()) {
            primitiveOperation2();
        }
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    private boolean hook() {
        return true;
    }
}
