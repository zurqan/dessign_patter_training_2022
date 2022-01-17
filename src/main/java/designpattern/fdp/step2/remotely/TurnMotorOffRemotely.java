package designpattern.fdp.step2.remotely;

import designpattern.fdp.step2.Command;

public class TurnMotorOffRemotely implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is Off Remotely");
    }
}
