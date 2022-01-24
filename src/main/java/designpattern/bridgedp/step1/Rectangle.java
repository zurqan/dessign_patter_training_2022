package designpattern.bridgedp.step1;

public class Rectangle extends Shape {
    public Rectangle(Filler filler) {
        super(filler);
    }

    @Override
    public void draw() {
        System.out.print("Draw rectangle ");
        filler.fill();
    }
}
