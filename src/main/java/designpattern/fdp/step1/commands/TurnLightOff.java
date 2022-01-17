package designpattern.fdp.step1.commands;

import designpattern.fdp.step1.service.Command;

public class TurnLightOff implements Command {

    @Override
    public void execute() {
        System.out.println("Light is Off");
    }
}
