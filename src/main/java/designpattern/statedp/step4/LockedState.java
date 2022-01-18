package designpattern.statedp.step4;

public class LockedState extends TurnstileState {

    @Override
    void coin(TurnstileFSM turnstileFSM) {
        turnstileFSM.unlock();
        turnstileFSM.setState(UNLOCKED_STATE);
    }

    @Override
    void pass(TurnstileFSM turnstileFSM) {
        turnstileFSM.alarm();
    }
}
