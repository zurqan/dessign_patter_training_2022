package designpattern.decoratordp.step1;

public class BorderView extends DecoratorView {

    private final int borderWidth;

    protected BorderView(View view, int borderWidth) {
        super(view);
        this.borderWidth = borderWidth;
    }

    @Override
    public void draw() {
        internalView().draw();
        System.out.println("Draw Border width: "+borderWidth);

    }
}
