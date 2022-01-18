package designpattern.statedp.step1;

import java.util.Scanner;

public class TurnstileFSM {

    private final Turnstile turnstile;

    public enum Event{COIN,PASS};
    public enum State{LOCKED,UNLOCKED};
    private State state=State.LOCKED;

    public TurnstileFSM(Turnstile turnstile) {
        this.turnstile = turnstile;
    }


    public void receiveEvent(Event event){

        switch (state){

            case LOCKED:
                switch (event){
                    case PASS:
                        turnstile.alarm();
                        break;
                    case COIN:
                        state=State.UNLOCKED;
                        turnstile.unlock();
                        break;

                }
                break;
            case UNLOCKED:
                switch (event){
                    case PASS:
                        state=State.LOCKED;
                        turnstile.lock();
                        break;
                    case COIN:
                        turnstile.thankYou();
                        break;
                }
                break;

        }
    }

    public static void main(String[] args) {
        TurnstileFSM turnstileFSM = new TurnstileFSM(new Turnstile());

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Event event = Event.valueOf(scanner.nextLine());
            turnstileFSM.receiveEvent(event);
        }
    }
}
