package designpattern.singletondp.step3;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

public class UserManager {

    private static UserManager instance;
    public static int numberOfInstance;
    private UserManager() {
        System.out.println("instance of UserManager is created.. instance number "+(++numberOfInstance));
    }

    public synchronized static UserManager instance(){
        if(instance == null){
            instance=new UserManager();
        }
        return instance;
    }

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(1);

        Runnable runnable= ()->{
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            UserManager.instance();
        };

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        countDownLatch.countDown();

    }

//        public static void main(String[] args)
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
//
}
