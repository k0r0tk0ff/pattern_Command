package ru.k0r0k0ff;

/**
 * Created by user on 1/18/2018.
 */
public class LightOffImpl implements Command{

    private Light light;
    public LightOffImpl (Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
