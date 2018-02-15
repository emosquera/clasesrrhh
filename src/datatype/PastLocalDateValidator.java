package datatype;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class PastLocalDateValidator implements ConstraintValidator<PastLocalDate,Temporal> {

    @Override
    public void initialize(PastLocalDate constraintAnnotation) {
    }

    @Override
    public boolean isValid(Temporal value, ConstraintValidatorContext context) {
        if (value instanceof LocalDate) {
            return ((LocalDate) value).isBefore(LocalDate.now());
        }
        return value instanceof LocalDateTime && ((LocalDateTime) value).isBefore(LocalDateTime.now());

    }
}
