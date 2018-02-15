package datatype;



import commons.StringUtils;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class MinMoneyValidator implements ConstraintValidator<MinMoney,Money> {

    private BigDecimal min;

    @Override
    public void initialize(MinMoney constraintAnnotation) {
        if (!StringUtils.isEmpty(constraintAnnotation.value()))
            min = new BigDecimal(constraintAnnotation.value());

    }

    @Override
    public boolean isValid(Money value, ConstraintValidatorContext context) {
        return !(value == null || min == null) && value.getAmount().compareTo(min) >= 0;
    }
}

