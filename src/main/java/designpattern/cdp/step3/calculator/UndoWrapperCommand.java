package designpattern.cdp.step3.calculator;

import designpattern.cdp.step3.app.Command;

public class UndoWrapperCommand implements Command {

    private final Command targetCommand;
    private final Calculator calculator;

    public UndoWrapperCommand(Command targetCommand, Calculator calculator) {
        this.targetCommand = targetCommand;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        this.targetCommand.execute();
        this.calculator.history().push(targetCommand);
    }

    @Override
    public void undo() {
        this.targetCommand.undo();
    }
}
