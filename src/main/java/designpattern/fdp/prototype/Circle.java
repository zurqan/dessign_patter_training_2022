package designpattern.fdp.prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius=radius;
    }

    public Circle(Circle another){
        super(another.getX(),another.getY());
        this.radius=another.radius;
    }


    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
