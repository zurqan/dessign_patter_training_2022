package designpattern.chaindp.step1;

public abstract class ChainValidator {

    private final ChainValidator next;


    protected ChainValidator(ChainValidator next) {
        this.next = next;
    }

    protected ChainValidator next(){
        return next;
    }

    public abstract boolean validate(String email);

    protected boolean doNext(String email){
        return next != null && next.validate(email);
    }
}
