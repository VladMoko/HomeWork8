package ArraList;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] data;

    ArrayIterator(E[] values){
        this.data = values;
    }
    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public E next() {
        return data[index++];
    }
}
