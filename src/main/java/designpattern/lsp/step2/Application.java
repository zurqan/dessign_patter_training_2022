package designpattern.lsp.step2;

public class Application {


    public static void main(String[] args) {
        RectangleService rectangleService = new RectangleService();

        Rectangle rectangle = new Square();

        rectangleService.work(rectangle);
    }

}
