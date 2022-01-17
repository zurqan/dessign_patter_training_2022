package designpattern.fdp.prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle another){
        super(another.getX(),another.getY());
        this.width =another.width;
        this.height=another.height;
    }


    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
