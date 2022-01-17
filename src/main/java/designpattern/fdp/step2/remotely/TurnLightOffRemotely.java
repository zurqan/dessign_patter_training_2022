package designpattern.fdp.step2.remotely;

import designpattern.fdp.step2.Command;

public class TurnLightOffRemotely implements Command {

    @Override
    public void execute() {
        System.out.println("Light is Off Remotely");
    }
}
