package designpattern.ocp.step3;

import designpattern.ocp.step2.ShapeType;

public class Circle implements Shape {


    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public double area() {
        return this.radius*this.radius*Math.PI;
    }
}
