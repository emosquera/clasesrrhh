package datatype;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class FutureLocalDateValidator implements ConstraintValidator<FutureLocalDate,Temporal> {

    @Override
    public void initialize(FutureLocalDate constraintAnnotation) {
    }

    @Override
    public boolean isValid(Temporal value, ConstraintValidatorContext context) {
        if (value instanceof LocalDate) {
            return ((LocalDate) value).isAfter(LocalDate.now());
        }
        return value instanceof LocalDateTime && ((LocalDateTime) value).isAfter(LocalDateTime.now());

    }
}
