package designpattern.decoratordp.step1;

public class ScrollDecorator extends DecoratorView {
    protected ScrollDecorator(View view) {
        super(view);
    }

    @Override
    public void draw() {
        internalView().draw();
        System.out.println("Draw scroll");
    }
}
