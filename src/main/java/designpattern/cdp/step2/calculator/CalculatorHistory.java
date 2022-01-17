package designpattern.cdp.step2.calculator;

import designpattern.cdp.step2.app.Command;

import java.util.LinkedList;

public class CalculatorHistory {
    private final LinkedList<Command> commands= new LinkedList<>();

    public Command pop() {
        return commands.pop();
    }

    public void push(Command targetCommand) {
        commands.push(targetCommand);
    }
}
