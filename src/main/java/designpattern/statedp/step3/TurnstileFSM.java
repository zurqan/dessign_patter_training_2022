package designpattern.statedp.step3;

import java.util.Scanner;

public class TurnstileFSM {

    private TurnstileState state;

    public TurnstileFSM(TurnstileState state) {
        this.state = state;
    }

    public void coin() {
        state.coin(this);
    }

    public void pass() {
        state.pass(this);
    }

    public void setState(TurnstileState state) {
        this.state = state;
    }


    void lock() {
        System.out.println("lock");
    }

    void unlock() {
        System.out.println("unlock");
    }

    void alarm() {
        System.out.println("alarm");
    }

    void thankYou() {
        System.out.println("thankYou");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TurnstileFSM turnstileFSM = new TurnstileFSM(new LockedState());

        while (scanner.hasNext()){
            String event = scanner.nextLine();
            if(event.equalsIgnoreCase("coin")){
                turnstileFSM.coin();
            }else if (event.equalsIgnoreCase("pass")){
                turnstileFSM.pass();
            }else {
                System.out.println("Not valid event");
            }
        }


    }
}
