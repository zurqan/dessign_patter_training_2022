package designpattern.fdp.step1.service;

import designpattern.fdp.step1.commands.TurnLightOff;
import designpattern.fdp.step1.commands.TurnLightOn;
import designpattern.fdp.step1.commands.TurnMotorOff;
import designpattern.fdp.step1.commands.TurnMotorOn;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Sensor[] sensors= new Sensor[]{
                new Sensor(new TurnLightOn()),
                new Sensor(new TurnLightOff()),
                new Sensor(new TurnMotorOn()),
                new Sensor(new TurnMotorOff())
        };

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int sensorIndex= scanner.nextInt();
            sensors[sensorIndex].trigger();
        }
    }
}
