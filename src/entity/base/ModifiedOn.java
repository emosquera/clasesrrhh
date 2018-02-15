package entity.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a property which should be updated with a timestamp when the entity
 * gets updated. By settings {@link #onCreate()} to {@code true}, the property
 * gets also set when the entity is persisted.
 *
 * @author igonzalez@quarksoft.net
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ModifiedOn {

    /**
     * @return indicates if the property gets also set when the entity is persisted (created).
     */
    boolean onCreate() default false;
}
