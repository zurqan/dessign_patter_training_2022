package designpattern.fdp.step2.wired;

import designpattern.fdp.step2.Command;

public class TurnLightOff implements Command {

    @Override
    public void execute() {
        System.out.println("Light is Off");
    }
}
