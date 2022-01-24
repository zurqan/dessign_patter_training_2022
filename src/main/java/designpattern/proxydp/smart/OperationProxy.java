package designpattern.proxydp.smart;

public class OperationProxy implements Operation {

    private final Operation operation;

    public OperationProxy(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void longTimeOperation() {
        long before = System.nanoTime();
        operation.longTimeOperation();
        long after = System.nanoTime();
        System.out.println("Method invocation time "+(after-before)+ " nano seconds");
    }

}
