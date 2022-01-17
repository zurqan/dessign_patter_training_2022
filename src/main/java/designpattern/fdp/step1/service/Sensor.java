package designpattern.fdp.step1.service;

public class Sensor {

    private final Command command;

    public Sensor(Command command) {
        this.command = command;
    }

    public void trigger(){
        this.command.execute();
    }
}
