package A1222I1_Module02.baitap.ss10_dsa;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.ArrayList;
import java.util.Arrays;


public class MyList<E> {
    //    ArrayList
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    void ensureCapacity(int minCapacity) {
        if (minCapacity >= elements.length) {
            E[] newArr = (E[]) new Object[minCapacity * 2 + 1];
            System.arraycopy(elements, 0, newArr, 0, minCapacity);
            elements = newArr;
        }
    }

    void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, element, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
            elements[--size] = null;
            return oldValue;
        }
        return oldValue;
    }

    public int size() {
        return this.size;
    }

    public Object clone() {
        MyList<E> newArr = new MyList<>();
        newArr.elements = Arrays.copyOf(elements, size);
        newArr.size=size;
        return newArr;
    }

    public int indexOf(E o) {
        for (int j = 0; j < size; j++) {
            if (o.equals(elements[j])) {
                return j;
            }
        }
        return -1;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    E get(int i) {
        return (E) this.elements[i];
    }

    void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }


}
