package designpattern.cdp.step2.calculator;

import designpattern.cdp.step2.app.Command;

public class MultiplyCommand implements Command {

    private final double n;
    private final Calculator calculator;
    private double backupTotal;

    public MultiplyCommand(double n, Calculator calculator) {
        this.n = n;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        double total =this.calculator.getTotal();
        this.backupTotal=total;
        this.calculator.setTotal(total*n);
        System.out.println("Total: "+this.calculator.getTotal());
        this.calculator.history().push(this);


    }

    @Override
    public void undo() {
        this.calculator.setTotal(this.backupTotal);
        System.out.println("Total: "+this.calculator.getTotal());


    }
}
