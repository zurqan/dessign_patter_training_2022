package designpattern.dependency.step1.business ;

import designpattern.dependency.step1.lowlevel.Rectangle;

import java.awt.Canvas;

public class Service {

    private final Rectangle rectangle;

    public Service(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void doService(){

        rectangle.draw(new Canvas());
    }
}
