package designpattern.cdp.step3.calculator;

import designpattern.cdp.step3.app.Command;

public class UndoCommand implements Command {

    private final Calculator calculator;

    public UndoCommand(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public void execute() {
        Command lastCommand= calculator.history().pop();
        lastCommand.undo();
    }

    @Override
    public void undo() {

    }
}
