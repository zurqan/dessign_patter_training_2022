package designpattern.proxydp.smart;

public class Application {

    public static void main(String[] args) {
        Operation op = new OperationProxy(new DefaultOperation());

        op.longTimeOperation();
    }
}
