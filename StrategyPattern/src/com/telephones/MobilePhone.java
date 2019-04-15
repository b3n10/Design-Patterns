package com.telephones;

abstract class MobilePhone {
    IScreenBehaviour _iScreenBehaviour;

    public MobilePhone(IScreenBehaviour iScreenBehaviour) {
        _iScreenBehaviour = iScreenBehaviour;
    }

    abstract void showDisplay();
}
