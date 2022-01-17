package designpattern.fdp.step2.wired;

import designpattern.fdp.step2.Command;

public class TurnMotorOn implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is On");
    }
}
