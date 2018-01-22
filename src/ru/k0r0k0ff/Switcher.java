package ru.k0r0k0ff;

public class Switcher {
    private LightOnImpl lightOn;
    private LightOffImpl lightOff;

    public Switcher(LightOnImpl lightOn, LightOffImpl lightOff) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
    }

    public void switchOn() {
        lightOn.execute();
    }

    public void switchOff() {
        lightOff.execute();
    }
}
