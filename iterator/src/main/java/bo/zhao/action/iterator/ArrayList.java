package bo.zhao.action.iterator;

/**
 * @author Bo.Zhao
 * @since 19/6/16
 */
public class ArrayList<E> implements List<E> {

    private E[] values;

    private int nextUsableIndex = 0;

    private int modifyCount = 0;

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        values = (E[]) new Object[capacity];
    }

    @Override
    public void add(E ele) {
        if (nextUsableIndex == values.length) {
            throw new IndexOutOfBoundsException("集合中已填满数据");
        }
        values[nextUsableIndex] = ele;
        nextUsableIndex++;
        modifyCount++;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return values[index];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        values[index] = null;
        if (index != values.length - 1) {
            System.arraycopy(values, index, values, index + 1, nextUsableIndex - index);
        }
        nextUsableIndex--;
        modifyCount++;
    }

    @Override
    public int size() {
        return nextUsableIndex;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this);
    }

    @Override
    public int getModifyCount() {
        return modifyCount;
    }

    private void checkIndex(int index) {
        if (index >= nextUsableIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
