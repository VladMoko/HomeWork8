package ArraList;

import java.util.Iterator;

public class MyArrayList<E> implements Simple<E> {
    private E[] data;

    public static void main(String[] args) {
        Simple<String> strings = new MyArrayList<>();
        strings.add("First");   //Работает
        strings.add("Second");
        strings.add("Tree");

        strings.upDate(1,"Not Second");
        System.out.println(strings.get(1));
        System.out.println();

        strings.remove(0);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println();

        System.out.println(strings.size());

        strings.clear();
        System.out.println(strings.get(0));
    }

    //конструктор
    public MyArrayList() {
        data = (E[]) new Object[0];
    }

    //Добавление элемента в массив с длинной +1
    @Override
    public boolean add(E e) {
        try {
            E[] time = data;
            data = (E[]) new Object[time.length + 1];
            System.arraycopy(time, 0, data, 0, time.length);
            data[data.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    //Замена элемента по индексу (Бонус + для себя лично)
    @Override
    public void upDate(int index, E e) {
        data[index] = e;
    }

    @Override
    public void remove(int index) {
        try {
            E[] time = data;
            data = (E[]) new Object[time.length - 1];
            System.arraycopy(time, 0, data, 0, index);
            int amountElementAfterIndex = time.length - index - 1;
            System.arraycopy(time, index + 1, data, index, amountElementAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

    }

    //Получение элемента по индексу
    @Override
    public E get(int index) {
        return data[index];
    }

    //Возврат размера массива
    @Override
    public int size() {
        return data.length;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size();i++){
            data[i] = null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(data);
    }
}
