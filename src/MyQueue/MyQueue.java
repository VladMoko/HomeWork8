package MyQueue;


public class MyQueue<T> implements Methord<T> {

    //Массив
    private T[] array;

    //Конструктор
    public MyQueue() {
        array = (T[]) new Object[0];
    }


    public T get(int index){
        return array[index];
    }

    //Реализация метода add , как и в ArrayList
    @Override
    public boolean add(T o) {
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

    //Удаление такое же как и в ArrayList
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

    //Опять ArrayList
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
            return array[0];
        }
    }


    @Override
    public T poll() {
        if (size() == 0) {
            return null;
        }
        try {
            T[] time = array;
            array = (T[]) new Object[time.length - 1];
            System.arraycopy(time, 0, array, 0, array.length);

        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return array[0];
    }
}
