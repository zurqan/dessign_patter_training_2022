package designpattern.statedp.step3;

public class UnLockedState implements TurnstileState {

    @Override
    public void coin(TurnstileFSM turnstileFSM) {
        turnstileFSM.thankYou();
    }

    @Override
    public void pass(TurnstileFSM turnstileFSM) {

        turnstileFSM.setState(new LockedState());

        turnstileFSM.lock();

    }
}
