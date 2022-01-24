package designpattern.bridgedp.step1;

public class RedFiller implements Filler {
    @Override
    public void fill() {
        System.out.println("Fill with red");
    }
}
