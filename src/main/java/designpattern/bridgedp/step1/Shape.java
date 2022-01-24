package designpattern.bridgedp.step1;



public abstract class Shape {

    protected Filler filler;

    public Shape(Filler filler) {
        this.filler = filler;
    }

    public abstract void draw();
}
