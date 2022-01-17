package designpattern.lsp.step2;


public class RectangleService {

    public void work(Rectangle rectangle){

        rectangle.setHeight(10);
        rectangle.setWidth(20);

        double area = rectangle.area();
        System.out.println("area = " + area);
    }
}
