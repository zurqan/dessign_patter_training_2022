package designpattern.statedp.step3;

public class LockedState implements TurnstileState {

    @Override
    public void coin(TurnstileFSM turnstileFSM) {
        turnstileFSM.unlock();
        turnstileFSM.setState(new UnLockedState());
    }

    @Override
    public void pass(TurnstileFSM turnstileFSM) {
        turnstileFSM.alarm();
    }
}
