package datatype;



import commons.StringUtils;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MoneyCurrencyValidator implements ConstraintValidator<MoneyCurrencyRequired,Money> {

    @Override
    public void initialize(MoneyCurrencyRequired constraintAnnotation) {
    }

    @Override
    public boolean isValid(Money value, ConstraintValidatorContext context) {
        return !(value == null || StringUtils.isEmpty(value.getCurrency()));
    }
}
