package designpattern.singletondp.step1;

public class UserManager {

    private static UserManager instance= new UserManager();

    private UserManager() {
        System.out.println("instance of UserManager is created");
    }

    public static UserManager instance(){
        return instance;
    }


    public static void main(String[] args) {
        UserManager instance = UserManager.instance();
        UserManager instance2 = UserManager.instance();

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }

}
