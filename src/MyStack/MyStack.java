package MyStack;

import java.util.Arrays;

public class MyStack<T> implements Methods<T> {

    private T[] array;

    public MyStack() {
        array = (T[]) new Object[0];
    }

    @Override
    public boolean push(T o) {
        try {
            T[] time = array;
            array = (T[]) new Object[time.length + 1];
            System.arraycopy(time, 0, array, 0, time.length);
            array[array.length - 1] = o;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] time = array;
            array = (T[]) new Object[time.length - 1];
            System.arraycopy(time, 0, array, 0, index);
            int amountElementAfterIndex = time.length - index - 1;
            System.arraycopy(time, index + 1, array, index, amountElementAfterIndex);
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void clear() {
        T[] time = array;
        array = (T[]) new Object[time.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public T peek() {
        if (size() == 0) {
            return null;
        } else {
            return array[array.length - 1];
        }
    }

    @Override
    public T pop() {
        if (size() == 0) {
            return null;
        }
        String result = (String) array[array.length - 1];

        try {
            T[] time = array;
            array = (T[]) new Object[time.length - 1];
            System.arraycopy(time, 0, array, 0, array.length);

        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return (T) result;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
