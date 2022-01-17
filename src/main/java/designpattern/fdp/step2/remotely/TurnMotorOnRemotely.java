package designpattern.fdp.step2.remotely;

import designpattern.fdp.step2.Command;

public class TurnMotorOnRemotely implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is On Remotely");
    }
}
