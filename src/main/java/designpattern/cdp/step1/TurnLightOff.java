package designpattern.cdp.step1;

public class TurnLightOff implements Command {

    @Override
    public void execute() {
        System.out.println("Light is Off");
    }
}
