package designpattern.observerdp.step1;

public class UserRegistrationDashBoard implements Observer {
    private final UserRegistration userRegistration;

    public UserRegistrationDashBoard(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    @Override
    public void update() {
        System.out.println(userRegistration.names());
    }
}
