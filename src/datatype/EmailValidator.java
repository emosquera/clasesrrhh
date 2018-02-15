package datatype;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;

public class EmailValidator implements ConstraintValidator<Email,String> {

    private java.util.regex.Pattern pattern;

    private String basePattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public void initialize(Email constraintAnnotation) {
        pattern = java.util.regex.Pattern.compile( basePattern );
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if ( value == null ) {
            return true;
        }
        Matcher m = pattern.matcher( value );
        return m.matches();
    }
}
