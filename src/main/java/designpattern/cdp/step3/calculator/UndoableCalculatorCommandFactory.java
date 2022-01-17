package designpattern.cdp.step3.calculator;

import designpattern.cdp.step3.app.Command;
import designpattern.cdp.step3.app.CommandFactory;

import java.util.StringTokenizer;

public class UndoableCalculatorCommandFactory implements CommandFactory {

    private Calculator calculator = new Calculator();

    @Override
    public Command create(String commandStr) {
        StringTokenizer stringTokenizer = new StringTokenizer(commandStr, " ");
        String operation = stringTokenizer.nextToken();
        switch (operation) {
            case "+":
                return  wrap(new AddCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator));
            case "-":
                return wrap(new SubtractCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator));
            case "*":
                return wrap(new MultiplyCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator));
            case "/":
                return wrap(new DivideCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator));
            case "U":
                return new UndoCommand(calculator);
            default:
                throw new IllegalArgumentException();
        }
    }

    public UndoWrapperCommand wrap(Command command){
        return new UndoWrapperCommand(command, calculator);
    }
}
