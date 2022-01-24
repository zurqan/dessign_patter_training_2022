package designpattern.mediatordp.step1;

import static designpattern.mediatordp.step1.ListView.ListItem.of;

public class Application {

    public static void main(String[] args) {

        InputText inputText = new InputText();

        ListView listView = new ListView(of("Proximity of public K-12 schools"),
                of("Proximity of child-friendly parks"),
                of("Proximity of grocery shopping"),
                of("Proximity of fast food"),
                of("Proximity of fine dining"),
                of("Neighborhood walkability"),
                of("Availability of public transit"),
                of("Proximity of hospital and medical services"),
                of("Level of traffic noise"),
                of("Access to major highways"),
                of("Up"),
                of("Down"),
                of("Not Important"));

        ViewMediator viewMediator = new ViewMediator(inputText, listView);
        viewMediator.init();

        simulateInput(inputText,"A");
        simulateInput(inputText,"Ac");
        simulateInput(inputText,"P");
        simulateInput(inputText,"L");
        simulateInput(inputText,"");
    }

    public static void simulateInput(InputText inputText,String text) {
        System.out.printf("====== [ Input %s ] ========\n",text);
        inputText.setText(text);
    }
}
