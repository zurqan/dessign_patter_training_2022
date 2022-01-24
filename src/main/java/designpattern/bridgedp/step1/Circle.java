package designpattern.bridgedp.step1;

public class Circle extends Shape {
    public Circle(Filler filler) {
        super(filler);
    }

    @Override
    public void draw() {
        System.out.print("Draw circle ");
        filler.fill();
    }
}
