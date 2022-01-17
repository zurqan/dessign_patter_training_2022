package designpattern.fdp.fmethod;

import java.util.ArrayList;
import java.util.List;

public abstract class DocumentApplication {

    private List<Document> docs=new ArrayList<>();

    public abstract Document createDocument();

    public void newDocument(){
        Document document = createDocument();
        document.open();
        docs.add(document);

    }

    public void openDocument(int index){
        docs.get(index).open();
    }
}
