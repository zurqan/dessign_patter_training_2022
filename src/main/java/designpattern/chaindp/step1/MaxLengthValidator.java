package designpattern.chaindp.step1;

public class MaxLengthValidator extends ChainValidator {
    private final int maxLength;

    protected MaxLengthValidator(ChainValidator next, int maxLength) {
        super(next);
        this.maxLength = maxLength;
    }

    @Override
    public boolean validate(String email) {
        return email.length()>=maxLength
                ?false
                :doNext(email);
    }
}
