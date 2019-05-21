package bo.zhao.action.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Bo.Zhao
 * @since 18/10/10
 */
public interface Document {

    void put(String key, Object value);

    Object get(String key);


    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
