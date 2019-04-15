package com.telephones;

public class MotoRazr extends MobilePhone {
    public MotoRazr(IScreenBehaviour iScreenBehaviour) {
        super(iScreenBehaviour);
    }

    @Override
    void showDisplay() {
        _iScreenBehaviour.getDescription();
    }
}
