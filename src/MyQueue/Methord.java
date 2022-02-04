package MyQueue;

public interface Methord<T> {
    boolean add(T t);
    void remove(int index);
    void clear();
    int  size();
    T peek();
    T poll();
    T get(int index);
}
