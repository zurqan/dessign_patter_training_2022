package designpattern.decoratordp.step1;

public class Application {

    public static void main(String[] args) {

        View textView = new ScrollDecorator(new BorderView(new TextView(),20));

        textView.draw();


    }
}
