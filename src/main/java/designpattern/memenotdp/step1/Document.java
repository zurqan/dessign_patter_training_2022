package designpattern.memenotdp.step1;

public class Document {

    private String id;

    private String title;

    private String text;


    public DocumentState state(){
        return new DocumentStateImpl(id, title, text);
    }

    public void restore(DocumentState documentState){
        if(!(documentState instanceof DocumentStateImpl)){
            new IllegalArgumentException("Provided state is invalid");
        }
        DocumentStateImpl _state = (DocumentStateImpl)documentState;
        this.id=_state.id;
        this.title=_state.title;
        this.text=_state.text;
    }

    private class DocumentStateImpl implements DocumentState{

        private final String id;
        private final String title;
        private final String text;

        public DocumentStateImpl(String id, String title, String text) {
            this.id = id;
            this.title = title;
            this.text = text;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
