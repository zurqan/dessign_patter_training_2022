package designpattern.dependency.step2.lowlevel;

import designpattern.dependency.step2.business.Shape;

import java.awt.Canvas;

public class Rectangle implements Shape {

    public void draw(Canvas canvas ){

        System.out.println("Draw Rectangle");
    }
}
