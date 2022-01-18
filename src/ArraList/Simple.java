package ArraList;

public interface Simple<E> extends Iterable<E> {
    boolean add(E e);


    void upDate(int index, E e);

    void remove(int index);

    E get(int index);

    int size();

    void clear();
}
