package designpattern.mediatordp.step1;

import java.util.Observable;

public class InputText extends Observable {

    private String text="";

    public void clear(){
        setText("");
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        if(this.text.equals(text)){
            return;
        }
        this.text = text;
        setChanged();
        notifyObservers(text);
    }
}
