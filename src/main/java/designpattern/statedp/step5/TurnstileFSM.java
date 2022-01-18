package designpattern.statedp.step5;

import java.util.Scanner;

public abstract class TurnstileFSM {

    private TurnstileState state;

    public TurnstileFSM(TurnstileState state) {
        this.state = state;
    }

    public void coin() {
        state.coin(this);
    }

    public void pass() {
        state.pass(this);
    }

    public void setState(TurnstileState state) {
        this.state = state;
    }


    public abstract void lock();

    public abstract void unlock();

    public abstract void alarm();

    public abstract void thankYou();


}
