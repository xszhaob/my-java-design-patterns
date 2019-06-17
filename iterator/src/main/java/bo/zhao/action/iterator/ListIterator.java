package bo.zhao.action.iterator;

import java.util.ConcurrentModificationException;

/**
 * @author Bo.Zhao
 * @since 19/6/16
 */
public class ListIterator<T> implements Iterator<T> {

    private final List<T> innerList;

    private final int count;

    private final int modifyCount;

    private int currentIndex;

    public ListIterator(List<T> list) {
        innerList = list;
        count = list.size();
        modifyCount = list.getModifyCount();
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        checkModify();
        return currentIndex < count;
    }

    @Override
    public T next() {
        checkModify();
        return innerList.get(currentIndex++);
    }

    private void checkModify() {
        if (modifyCount != innerList.getModifyCount()) {
            throw new ConcurrentModificationException();
        }
    }
}
