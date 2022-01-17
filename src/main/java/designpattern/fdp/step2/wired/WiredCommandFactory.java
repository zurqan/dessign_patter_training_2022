package designpattern.fdp.step2.wired;


import designpattern.fdp.step2.Command;
import designpattern.fdp.step2.CommandFactory;

public class WiredCommandFactory implements CommandFactory {

    @Override
    public Command makeTurnLightOnCommand() {
        return new TurnLightOn();
    }

    @Override
    public Command makeTurnLightOffCommand() {
        return new TurnLightOff();
    }

    @Override
    public Command makeTurnMotorOnCommand() {
        return new TurnMotorOn();
    }

    @Override
    public Command makeTurnMotorOffCommand() {
        return new TurnMotorOff();
    }
}
