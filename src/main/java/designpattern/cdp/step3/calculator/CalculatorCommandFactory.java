package designpattern.cdp.step3.calculator;

import designpattern.cdp.step3.app.Command;
import designpattern.cdp.step3.app.CommandFactory;

import java.util.StringTokenizer;

public class CalculatorCommandFactory implements CommandFactory {

    private Calculator calculator = new Calculator();

    @Override
    public Command create(String commandStr) {
        StringTokenizer stringTokenizer = new StringTokenizer(commandStr, " ");
        String operation = stringTokenizer.nextToken();
        switch (operation) {
            case "+":
                return  new AddCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator);
            case "-":
                return new SubtractCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator);
            case "*":
                return new MultiplyCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator);
            case "/":
                return new DivideCommand(Double.parseDouble(stringTokenizer.nextToken()), calculator);
            case "U":
                return new UndoCommand(calculator);
            default:
                throw new IllegalArgumentException();
        }
    }

}
