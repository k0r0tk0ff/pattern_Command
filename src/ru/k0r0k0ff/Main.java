package ru.k0r0k0ff;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        LightOnImpl lightOn = new LightOnImpl(light);
        LightOffImpl lightOff = new LightOffImpl(light);

        Switcher switcher = new Switcher(lightOn, lightOff);

        switcher.switchOn();
        switcher.switchOff();
        
        /*
        Invoker invoker = new Invoker(Arrays.asList(new Switcher()));
        invoker.invokeAll();
        */
    }
}
