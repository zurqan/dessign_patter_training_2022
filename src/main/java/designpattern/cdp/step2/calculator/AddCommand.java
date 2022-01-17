package designpattern.cdp.step2.calculator;

import designpattern.cdp.step2.app.Command;

public class AddCommand implements Command {

    private final double n;
    private final Calculator calculator;

    public AddCommand(double n, Calculator calculator) {
        this.n = n;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        double total =this.calculator.getTotal();
        this.calculator.setTotal(total+n);
        System.out.println("Total: "+this.calculator.getTotal());
        this.calculator.history().push(this);
    }

    @Override
    public void undo() {
        double total =this.calculator.getTotal();
        this.calculator.setTotal(total-n);
        System.out.println("Total: "+this.calculator.getTotal());


    }
}
