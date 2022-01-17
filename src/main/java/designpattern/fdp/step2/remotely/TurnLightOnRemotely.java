package designpattern.fdp.step2.remotely;

import designpattern.fdp.step2.Command;

public class TurnLightOnRemotely implements Command {

    @Override
    public void execute() {
        System.out.println("Light is On Remotely");
    }
}
