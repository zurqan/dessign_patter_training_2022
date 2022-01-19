package designpattern.observerdp.step2;


import java.util.Observable;
import java.util.Observer;

public class UserRegistrationDashBoard implements Observer {




    @Override
    public void update(Observable o, Object arg) {
        System.out.println("UserRegistrationDashBoard.update");
        System.out.println("o.getClass() = " + o.getClass());
        System.out.println(arg);

    }
}
