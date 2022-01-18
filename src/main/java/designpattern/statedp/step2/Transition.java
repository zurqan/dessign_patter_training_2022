package designpattern.statedp.step2;

import designpattern.statedp.step2.TurnstileFSM.Event;
import designpattern.statedp.step2.TurnstileFSM.State;

import java.util.function.Consumer;

class Transition {

    final State currentState;
    final Event event;
    final State nextState;
    final Consumer<Turnstile> action;

    public Transition(State currentState, Event event, State nextState, Consumer<Turnstile> action) {
        this.currentState = currentState;
        this.event = event;
        this.nextState = nextState;
        this.action = action;
    }
}
