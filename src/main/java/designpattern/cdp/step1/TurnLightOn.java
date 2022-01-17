package designpattern.cdp.step1;

public class TurnLightOn implements Command {

    @Override
    public void execute() {
        System.out.println("Light is On");
    }
}
