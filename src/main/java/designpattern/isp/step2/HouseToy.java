package designpattern.isp.step2;

public class HouseToy implements Toy {

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


}
