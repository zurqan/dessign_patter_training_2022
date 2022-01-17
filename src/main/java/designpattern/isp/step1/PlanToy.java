package designpattern.isp.step1;

public class PlanToy implements  Toy {

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
