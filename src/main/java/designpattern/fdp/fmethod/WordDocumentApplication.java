package designpattern.fdp.fmethod;

public class WordDocumentApplication extends DocumentApplication {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
