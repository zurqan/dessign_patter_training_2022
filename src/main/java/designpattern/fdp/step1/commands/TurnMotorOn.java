package designpattern.fdp.step1.commands;

import designpattern.fdp.step1.service.Command;

public class TurnMotorOn implements Command {

    @Override
    public void execute() {
        System.out.println("Motor is On");
    }
}
