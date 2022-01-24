package designpattern.chaindp.step1;

public class MinLengthValidator extends ChainValidator {
    private final int minLength;

    protected MinLengthValidator(ChainValidator next, int minLength) {
        super(next);
        this.minLength = minLength;
    }

    @Override
    public boolean validate(String email) {
        return email.length()< minLength
                ?false
                :doNext(email);
    }
}
