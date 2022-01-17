package designpattern.fdp.fmethod;

public class PdfDocumentApplication extends DocumentApplication {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
