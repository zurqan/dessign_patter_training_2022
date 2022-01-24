package designpattern.memenotdp.step1;

public class Application {

    public static void main(String[] args) {

        Document document = new Document();

        document.setId("ABC");
        document.setTitle("First Title");
        document.setText("First Text");
        System.out.println("=====");

        System.out.println(document);
        DocumentState state1 = document.state();


        document.setTitle("Second Title");
        document.setText("Second Text");

        DocumentState state2 = document.state();
        System.out.println("=====");


        System.out.println(document);

        document.restore(state1);
        System.out.println("===== Re Store first state =======");

        System.out.println(document);

        document.restore(state2);
        System.out.println("===== Re Store second state =======");

        System.out.println(document);


        ///
        System.out.println("===== Create new document =======");
        Document newDoc = new Document();
        newDoc.restore(state2);
        System.out.println("newDoc = " + newDoc);

    }
}
