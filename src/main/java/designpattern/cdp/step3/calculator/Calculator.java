package designpattern.cdp.step3.calculator;

public class Calculator {

    private double total=0;
    private CalculatorHistory calculatorHistory = new CalculatorHistory();

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {

        this.total=total;
    }

    public CalculatorHistory history() {
        return calculatorHistory;
    }
}
