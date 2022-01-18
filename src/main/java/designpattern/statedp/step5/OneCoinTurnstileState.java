package designpattern.statedp.step5;


 public enum  OneCoinTurnstileState implements TurnstileState {


     LOCKED{

         @Override
         public void coin(TurnstileFSM turnstileFSM) {
             turnstileFSM.unlock();
             turnstileFSM.setState(UNLOCKED);
         }

         @Override
         public void pass(TurnstileFSM turnstileFSM) {
             turnstileFSM.alarm();
         }

     },
     UNLOCKED{
         @Override
         public void coin(TurnstileFSM turnstileFSM) {
             turnstileFSM.thankYou();
         }

         @Override
         public void pass(TurnstileFSM turnstileFSM) {

             turnstileFSM.setState(LOCKED);

             turnstileFSM.lock();

         }

     }
}
