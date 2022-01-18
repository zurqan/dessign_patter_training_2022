package designpattern.statedp.step4;

public class UnLockedState extends TurnstileState {

    @Override
    public void coin(TurnstileFSM turnstileFSM) {
        turnstileFSM.thankYou();
    }

    @Override
    public void pass(TurnstileFSM turnstileFSM) {

        turnstileFSM.setState(LOCKED_STATE);

        turnstileFSM.lock();

    }
}
