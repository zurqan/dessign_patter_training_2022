package designpattern.monostatedp.step1;

public class SubUserManager extends UserManager{

    @Override
    public void addUser(User user) {

        System.out.println("Before adding user");
        super.addUser(user);
        System.out.println("After adding user");
    }

    public static void main(String[] args) {
        UserManager userManager1 = new UserManager();
        UserManager userManager2 = new UserManager();
        UserManager userManager3 = new SubUserManager();

        userManager1.addUser(new User());
        userManager2.addUser(new User());
        userManager3.addUser(new User());

        System.out.println(userManager1.size());

        System.out.println(userManager1.hashCode());
        System.out.println(userManager2.hashCode());
        System.out.println(userManager3.hashCode());
    }

}
