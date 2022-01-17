package designpattern.cdp.step1;

public class TurnMotorOn implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is On");
    }
}
