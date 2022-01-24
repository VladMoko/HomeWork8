package MyStack;

public interface Methods<T> {
    boolean push(T o);
    void remove(int index);
    void clear();
    int size();
    T peek();
    T pop();
    T get(int index);
}
