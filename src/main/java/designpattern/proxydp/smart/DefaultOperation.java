package designpattern.proxydp.smart;

public class DefaultOperation implements Operation {

    public void longTimeOperation(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
