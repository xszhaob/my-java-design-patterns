package bo.zhao.action.iterator;

/**
 * @author Bo.Zhao
 * @since 19/6/16
 */
public interface List<E> extends Iterable<E> {

    void add(E ele);

    E get(int index);

    void remove(int index);

    int size();

    int getModifyCount();
}
