package designpattern.statedp.step5;

public interface TurnstileState {


    void coin(TurnstileFSM turnstileFSM);

    void pass(TurnstileFSM turnstileFSM);
}
