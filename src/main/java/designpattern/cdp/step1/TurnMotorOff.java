package designpattern.cdp.step1;

public class TurnMotorOff implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is Off");
    }
}
