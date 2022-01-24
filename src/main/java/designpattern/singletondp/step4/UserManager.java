package designpattern.singletondp.step4;

import designpattern.monostatedp.step1.User;

import java.io.*;
import java.lang.reflect.Constructor;

public class UserManager  implements Serializable{

    private static class UserManagerFactory {
        private static UserManager userManager = new UserManager();
    }

    private UserManager() {
        System.out.println("instance of UserManager is created");
    }

    public static UserManager instance() {
        return UserManagerFactory.userManager;
    }


//    public static void main(String[] args) {
//        UserManager instance = UserManager.instance();
//        UserManager instance2 = UserManager.instance();
//
//        System.out.println(instance.hashCode());
//        System.out.println(instance2.hashCode());
//
//    }
    public static void main(String[] args) {
        try {
            UserManager instance1 = UserManager.instance();
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            UserManager instance2 = (UserManager) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args)
//    {
//        UserManager instance1 = UserManager.instance();
//        UserManager instance2 = null;
//        try
//        {
//            Constructor[] constructors =
//                    UserManager.class.getDeclaredConstructors();
//            for (Constructor constructor : constructors)
//            {
//                // Below code will destroy the singleton pattern
//                constructor.setAccessible(true);
//                instance2 = (UserManager) constructor.newInstance();
//                break;
//            }
//        }
//
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        System.out.println("instance1.hashCode():- "
//                + instance1.hashCode());
//        System.out.println("instance2.hashCode():- "
//                + instance2.hashCode());
//    }
//


}
