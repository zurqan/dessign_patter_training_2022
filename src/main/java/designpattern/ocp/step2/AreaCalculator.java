package designpattern.ocp.step2;

public class AreaCalculator {

    public double area(Shape... shapes){
        double area = 0;
        for (Shape shape : shapes) {

            switch (shape.getType()){

                case RECTANGLE:
                    area+= ((Rectangle)shape).getHeight()*((Rectangle)shape).getWidth();
                    break;
                case CIRCLE:
                    area+= Math.pow(((Circle)shape).getRadius(),2)*Math.PI;
                    break;
            }

        }

        return area;
    }
}
