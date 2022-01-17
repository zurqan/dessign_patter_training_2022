package designpattern.fdp.step2.remotely;

import designpattern.fdp.step2.Command;
import designpattern.fdp.step2.CommandFactory;

public class RemoteCommandFactory implements CommandFactory {

    @Override
    public Command makeTurnLightOnCommand() {
        return new TurnLightOnRemotely();
    }

    @Override
    public Command makeTurnLightOffCommand() {
        return new TurnLightOffRemotely();
    }

    @Override
    public Command makeTurnMotorOnCommand() {
        return new TurnMotorOnRemotely();
    }

    @Override
    public Command makeTurnMotorOffCommand() {
        return new TurnMotorOffRemotely();
    }
}
