package designpattern.adapterdp.step3;

public class Switch {

    private final Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void on(){
        switchable.turnOn();
    }

    public void off(){
        switchable.turnOff();

    }
}
