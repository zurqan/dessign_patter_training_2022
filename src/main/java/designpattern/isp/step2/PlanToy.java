package designpattern.isp.step2;

public class PlanToy implements Toy,Flyable,Movable {

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

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
