package designpattern.observerdp.step1;

public class Application {

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        UserRegistrationDashBoard userRegistrationDashBoard = new UserRegistrationDashBoard(userRegistration);

        userRegistration.addObserver(userRegistrationDashBoard);

        userRegistration.register("Mohammad");
        userRegistration.register("Ahmad");
    }
}
