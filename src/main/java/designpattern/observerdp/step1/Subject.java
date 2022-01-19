package designpattern.observerdp.step1;


import java.util.HashSet;
import java.util.Set;

public class Subject {

    private Set<Observer> observers ;

    public Subject() {
        this.observers= new HashSet<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void deAttach(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyAllObservers(){

        observers
                .stream()
                .forEach(ob->ob.update());

    }
}
