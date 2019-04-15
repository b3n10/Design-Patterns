package com.didispizza;

public abstract class PitzaStore {
    abstract Pitza createPitza(String item);

    public Pitza orderPitza(String type) {
        Pitza pitza = createPitza(type);

        pitza.prepare();
        pitza.bake();
        pitza.cut();
        pitza.box();

        return pitza;
    }
}
