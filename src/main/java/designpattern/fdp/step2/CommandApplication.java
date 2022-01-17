package designpattern.fdp.step2;

import java.util.Scanner;

public class CommandApplication {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        CommandFactory commandFactory=(CommandFactory)Class.forName(args[0]).newInstance();

        Sensor[] sensors= new Sensor[]{
                new Sensor(commandFactory.makeTurnLightOnCommand()),
                new Sensor(commandFactory.makeTurnLightOffCommand()),
                new Sensor(commandFactory.makeTurnMotorOnCommand()),
                new Sensor(commandFactory.makeTurnMotorOffCommand())
        };

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int sensorIndex= scanner.nextInt();
            sensors[sensorIndex].trigger();
        }
    }
}
