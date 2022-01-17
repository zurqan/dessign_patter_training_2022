package designpattern.cdp.step2.app;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        CommandFactory commandFactory = (CommandFactory) Class.forName(args[0]).newInstance();


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String commandStr= scanner.nextLine();
            commandFactory.create(commandStr).execute();
        }

    }
}
