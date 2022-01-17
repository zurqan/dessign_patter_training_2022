package designpattern.fdp.step2;

public interface CommandFactory {

    Command makeTurnLightOnCommand();
    Command makeTurnLightOffCommand();
    Command makeTurnMotorOnCommand();
    Command makeTurnMotorOffCommand();
}
