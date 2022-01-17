package designpattern.cdp.step3.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationWithDelaySR {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {

        CommandFactory commandFactory = (CommandFactory) Class.forName(args[0]).newInstance();


        Scanner scanner = new Scanner(System.in);

        List<Command> commands = new ArrayList<>();

        while (scanner.hasNext()){
            String commandStr= scanner.nextLine();
            if(commandStr.equals("exit")){
                break;
            }
            commands.add(commandFactory.create(commandStr));
        }

        System.out.println("Wait 5 seconds");
        Thread.sleep(5000);

        commands
                .stream()
                .forEach(command -> command.execute());

    }
}
