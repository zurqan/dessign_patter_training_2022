package designpattern.isp.step2;

public class CarToy implements Toy,Movable {

    private String color;
    private double price;

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void move() {
        System.out.println("Move");
    }

}
