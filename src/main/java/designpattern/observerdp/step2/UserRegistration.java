package designpattern.observerdp.step2;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserRegistration extends Observable {

    private List<String> users = new ArrayList<>();

    public void register(String userName) {
        users.add(userName);
        setChanged();
        notifyObservers(new CopyOnWriteArrayList<>(users));
    }


}
