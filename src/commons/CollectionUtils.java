package commons;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {

    private CollectionUtils() {
        super();
    }

    public static boolean isNullOrEmpty(final Collection< ? > c ) {
        return c == null || c.isEmpty();
    }

    public static boolean isNullOrEmpty( final Map< ?, ? > m ) {
        return m == null || m.isEmpty();
    }

    public static boolean hasContent( final Collection< ? > c ) {
        return !isNullOrEmpty(c);
    }
}
