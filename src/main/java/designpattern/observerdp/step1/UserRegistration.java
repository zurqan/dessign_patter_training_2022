package designpattern.observerdp.step1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRegistration extends Subject {

    private List<String> users = new ArrayList<>();

    public void register(String userName) {
        users.add(userName);
        notifyAllObservers();
    }

    public List<String> names(){
        return new ArrayList<>(users);
    }

}
