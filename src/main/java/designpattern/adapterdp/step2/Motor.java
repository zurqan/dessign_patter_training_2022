package designpattern.adapterdp.step2;

public class Motor implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Motor.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Motor.turnOff");
    }
}
