package entity.base;

import javax.persistence.Transient;
import java.io.Serializable;

@FunctionalInterface
public interface Labeled extends Serializable{

    @Transient
    String getAsText();
}
