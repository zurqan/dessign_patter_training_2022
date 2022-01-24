package designpattern.singletondp.step2;

import java.util.concurrent.CountDownLatch;

public class UserManager {

    private static UserManager instance;
    public static int numberOfInstance;
    private UserManager() {
        System.out.println("instance of UserManager is created.. instance number "+(++numberOfInstance));
    }

    public static UserManager instance(){
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

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        countDownLatch.countDown();

    }

}
