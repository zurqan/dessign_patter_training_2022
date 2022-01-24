package designpattern.adapterdp.step3;

public class Lamp implements Switchable {

    public void turnOn(){
        System.out.println("Lamp.turnOn");
    }

    public void turnOff(){
        System.out.println("Lamp.turnOff");
    }
}
