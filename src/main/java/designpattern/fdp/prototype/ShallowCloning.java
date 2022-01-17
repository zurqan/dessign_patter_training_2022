package designpattern.fdp.prototype;

import java.util.Arrays;

public class ShallowCloning implements Cloneable {

    private int x=0;
    private int y=0;
    private int[] numbers;

    public ShallowCloning(int x, int y, int... numbers) {
        this.x = x;
        this.y = y;
        this.numbers = numbers;
    }

    @Override
    protected Object clone()  {
        Object clone = null;

        try {
            clone= super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ShallowCloning{" +
                "x=" + x +
                ", y=" + y +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public static void main(String[] args) {
        ShallowCloning orig = new ShallowCloning(10, 20, 1, 2, 3);

        ShallowCloning clone = (ShallowCloning)orig.clone();


        System.out.println("orig = " + orig);
        System.out.println("clone = " + clone);

        clone.setX(1000);

        System.out.println("orig = " + orig);
        System.out.println("clone = " + clone);


        clone.getNumbers()[0]=20000;

        System.out.println("orig = " + orig);
        System.out.println("clone = " + clone);

    }
}
