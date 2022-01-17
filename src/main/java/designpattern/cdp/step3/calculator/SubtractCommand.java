package designpattern.cdp.step3.calculator;

import designpattern.cdp.step3.app.Command;

public class SubtractCommand implements Command {

    private final double n;
    private final Calculator calculator;

    public SubtractCommand(double n, Calculator calculator) {
        this.n = n;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        double total =this.calculator.getTotal();
        this.calculator.setTotal(total-n);
        System.out.println("Total: "+this.calculator.getTotal());

    }

    @Override
    public void undo() {
        double total =this.calculator.getTotal();
        this.calculator.setTotal(total+n);
        System.out.println("Total: "+this.calculator.getTotal());


    }
}
