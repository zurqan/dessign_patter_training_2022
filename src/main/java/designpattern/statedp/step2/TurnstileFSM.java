package designpattern.statedp.step2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static designpattern.statedp.step2.TurnstileFSM.Event.COIN;
import static designpattern.statedp.step2.TurnstileFSM.Event.PASS;
import static designpattern.statedp.step2.TurnstileFSM.State.LOCKED;
import static designpattern.statedp.step2.TurnstileFSM.State.UNLOCKED;

public class TurnstileFSM {

    private final Turnstile turnstile;

    public enum Event{COIN,PASS};
    public enum State{LOCKED,UNLOCKED};
    private State state= LOCKED;

    private static List<Transition> transitions= new ArrayList(){{
        add(new Transition(LOCKED, COIN,UNLOCKED,ts->ts.unlock()));
        add(new Transition(LOCKED, PASS,LOCKED,ts->ts.alarm()));
        add(new Transition(UNLOCKED, COIN,UNLOCKED,ts->ts.thankYou()));
        add(new Transition(UNLOCKED, PASS,LOCKED,ts->ts.lock()));
    }};

    public TurnstileFSM(Turnstile turnstile) {
        this.turnstile = turnstile;
    }


    public void receiveEvent(Event event){
        Transition transition = transitions
                .stream()
                .filter(tr -> tr.currentState == state)
                .filter(tr -> tr.event == event)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Transition match"));

        this.state=transition.nextState;
        transition.action.accept(turnstile);


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
