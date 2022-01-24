package designpattern.chaindp.step1;

public class AlreadyExistsValidator extends ChainValidator {
    protected AlreadyExistsValidator(ChainValidator next) {
        super(next);
    }

    @Override
    public boolean validate(String email) {

        //check if it is already exist
        //...impl
        //we will assume that any email start with abc letter is already exist
        return email.startsWith("abc")
                ?false
                :doNext(email);
    }
}
