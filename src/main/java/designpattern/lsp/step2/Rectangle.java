package designpattern.lsp.step2;

public class Rectangle  implements Shape {

    private  int width;


    private  int height;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }



    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.height*this.width;
    }
}
