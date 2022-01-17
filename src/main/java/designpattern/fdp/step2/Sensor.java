package designpattern.fdp.step2;

public class Sensor {

    private final Command command;

    public Sensor(Command command) {
        this.command = command;
    }

    public void trigger(){
        this.command.execute();
    }
}
