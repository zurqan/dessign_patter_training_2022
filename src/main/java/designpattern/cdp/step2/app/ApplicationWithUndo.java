package designpattern.cdp.step2.app;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ApplicationWithUndo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        CommandFactory commandFactory = (CommandFactory) Class.forName(args[0]).newInstance();


        Scanner scanner = new Scanner(System.in);
        Deque<Command> history = new LinkedList<>();

        while (scanner.hasNext()){
            String commandStr= scanner.nextLine();
            if(commandStr.equals("U")){
                history.pop().undo();
            }else{

                Command command = commandFactory.create(commandStr);
                command.execute();
                history.push(command);
            }
        }

    }
}
