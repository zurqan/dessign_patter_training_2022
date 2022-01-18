package designpattern.statedp.step4;

public abstract class TurnstileState {

    final static TurnstileState LOCKED_STATE = new LockedState();
    final static TurnstileState UNLOCKED_STATE = new UnLockedState();

    abstract void coin(TurnstileFSM turnstileFSM);

    abstract void pass(TurnstileFSM turnstileFSM);
}
