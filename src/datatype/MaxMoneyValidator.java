package datatype;




import commons.StringUtils;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class MaxMoneyValidator implements ConstraintValidator<MaxMoney,Money> {

    private BigDecimal max;
    @Override
    public void initialize(MaxMoney constraintAnnotation) {
        if(!StringUtils.isEmpty(constraintAnnotation.value()))
            max = new BigDecimal(constraintAnnotation.value());

    }

    @Override
    public boolean isValid(Money value, ConstraintValidatorContext context) {
        return !(value == null || max == null) && value.getAmount().compareTo(max) < 0;

    }

}
