package designpattern.statedp.step5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TurnstileFSM turnstileFSM = new DefaultTurnstileFSM(OneCoinTurnstileState.LOCKED);

        while (scanner.hasNext()){
            String event = scanner.nextLine();
            if(event.equalsIgnoreCase("coin")){
                turnstileFSM.coin();
            }else if (event.equalsIgnoreCase("pass")){
                turnstileFSM.pass();
            }else {
                System.out.println("Not valid event");
            }
        }


    }

}
