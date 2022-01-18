package ArraList;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] data;

    ArrayIterator(E[] data){
        this.data = data;
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
