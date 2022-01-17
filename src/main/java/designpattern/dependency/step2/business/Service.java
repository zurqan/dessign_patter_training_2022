package designpattern.dependency.step2.business;

import java.awt.*;

public class Service {

    private final Shape shape;

    public Service(Shape shape) {
        this.shape = shape;
    }

    public void doService(){

        shape.draw(new Canvas());
    }
}
