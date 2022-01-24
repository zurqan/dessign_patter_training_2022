package designpattern.decoratordp.step1;

public abstract class DecoratorView implements View {

    private final View view;

    protected DecoratorView(View view) {
        this.view = view;
    }

    protected View internalView(){
        return view;
    }
}
