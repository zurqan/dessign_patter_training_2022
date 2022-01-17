package designpattern.cdp.step3.calculator;

import designpattern.cdp.step3.app.Command;

import java.util.Deque;
import java.util.LinkedList;

public class CalculatorHistory {
    private final Deque<Command> commands= new LinkedList<>();

    public Command pop() {
        return commands.pop();
    }

    public void push(Command targetCommand) {
        commands.push(targetCommand);
    }
}
