package designpattern.monostatedp.step1;




import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class UserManager {

    private static Queue<User> users = new ConcurrentLinkedDeque();

    public void addUser(User user){
        users.add(user);
    }

    public int size(){
       return users.size();
    }

    public boolean removeUser(User user){
        return users.remove(user);
    }


    public static void main(String[] args) {
        UserManager userManager1 = new UserManager();
        UserManager userManager2 = new UserManager();

        userManager1.addUser(new User());
        userManager2.addUser(new User());

        System.out.println(userManager1.size());
        System.out.println(userManager2.size());
    }

}
