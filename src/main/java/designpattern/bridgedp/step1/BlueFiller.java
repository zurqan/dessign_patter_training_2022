package designpattern.bridgedp.step1;

public class BlueFiller implements Filler {
    @Override
    public void fill() {
        System.out.println("Fill with blue");
    }
}
