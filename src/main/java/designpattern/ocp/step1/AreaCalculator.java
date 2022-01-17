package designpattern.ocp.step1;

public class AreaCalculator {

    public double area(Rectangle... rectangles){
        double area = 0;
        for (Rectangle rectangle : rectangles) {

            area+= rectangle.getHeight()*rectangle.getWidth();
        }

        return area;
    }
}
