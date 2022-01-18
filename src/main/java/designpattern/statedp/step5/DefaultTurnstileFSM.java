package designpattern.statedp.step5;


public class DefaultTurnstileFSM extends TurnstileFSM {

    public DefaultTurnstileFSM(TurnstileState state) {
        super(state);
    }

    public void lock() {
        System.out.println("lock");
    }

    public void unlock() {
        System.out.println("unlock");
    }

    public void alarm() {
        System.out.println("alarm");
    }

    public void thankYou() {
        System.out.println("thankYou");
    }


}
