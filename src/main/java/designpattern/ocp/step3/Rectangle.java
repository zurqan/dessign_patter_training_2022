package designpattern.ocp.step3;

import designpattern.ocp.step2.ShapeType;

public class Rectangle  implements Shape {

    private final int width;



    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return this.height*this.width;
    }
}
