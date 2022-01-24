package designpattern.chaindp.step1;

public class Application {

    public static void main(String[] args) {

        ChainValidator validator =
                new MinLengthValidator(
                        new MaxLengthValidator(
                                new AlreadyExistsValidator(
                                        new WellFormattedEmail(null)
                                ),
                                1000
                        ),
                        5
        );


        System.out.println("validator.validate(\"a\") = " + validator.validate("a"));
        System.out.println("validator.validate(\"a@a.com\") = " + validator.validate("a@a.com"));
        System.out.println("validator.validate(\"abc@a.com\") = " + validator.validate("abc@a.com"));
    }
}
