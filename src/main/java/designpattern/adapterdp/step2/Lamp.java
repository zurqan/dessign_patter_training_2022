package designpattern.adapterdp.step2;

public class Lamp implements Switchable{

    public void turnOn(){
        System.out.println("Lamp.turnOn");
    }

    public void turnOff(){
        System.out.println("Lamp.turnOff");
    }
}
