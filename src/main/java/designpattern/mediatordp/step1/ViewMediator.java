package designpattern.mediatordp.step1;

import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ViewMediator implements Observer {
    private final InputText inputText;

    private final ListView listView;

    public ViewMediator(InputText inputText, ListView listView) {
        this.inputText = inputText;
        this.listView = listView;

    }

    public void init(){
        inputText.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        String data = arg.toString();
        listView
                .items()
                .peek(li->li.setHidden(true))
                .peek(li->li.setSelected(false))
                .filter(startsWith(data))
                .peek(li->li.setHidden(false))
                .reduce((acc,item)->acc==null?item:acc)
                .ifPresent(makeItSelected());

        debug(listView);
    }

    private void debug(ListView listView) {
        listView
                .items()
                .filter(li->!li.isHidden())
                .forEach(System.out::println);

    }

    private Consumer<ListView.ListItem> makeItSelected() {
        return li->li.setSelected(true);
    }

    private Predicate<ListView.ListItem> startsWith(String data) {
        return li->li.getText().startsWith(data);
    }
}
