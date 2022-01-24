package designpattern.adapterdp.step1;

public class Switch {

    private final Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void on(){
        lamp.turnOn();
    }

    public void off(){
        lamp.turnOff();

    }
}
