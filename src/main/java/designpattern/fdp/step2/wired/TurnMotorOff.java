package designpattern.fdp.step2.wired;

import designpattern.fdp.step2.Command;

public class TurnMotorOff implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is Off");
    }
}
