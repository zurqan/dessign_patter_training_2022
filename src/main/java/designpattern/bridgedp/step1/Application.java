package designpattern.bridgedp.step1;

public class Application {

    public static void main(String[] args) {

        Shape shape1= new Circle(new RedFiller());

        Shape shape2 = new Rectangle(new BlueFiller());

        Shape shape3 = new Circle(new BlueFiller());

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
