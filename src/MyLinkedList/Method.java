package MyLinkedList;

public interface Method<E> {
    void add(E e);
    E remove(int index);
    void clear();
    int size();
    E get(int index);
}
