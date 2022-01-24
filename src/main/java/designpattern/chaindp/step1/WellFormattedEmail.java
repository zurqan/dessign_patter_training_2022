package designpattern.chaindp.step1;

public class WellFormattedEmail extends ChainValidator {
    protected WellFormattedEmail(ChainValidator next) {
        super(next);
    }

    @Override
    public boolean validate(String email) {
        return true;
    }
}
