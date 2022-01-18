package designpattern.statedp.step3;

public interface TurnstileState {

    void coin(TurnstileFSM turnstileFSM);

    void pass(TurnstileFSM turnstileFSM);
}
