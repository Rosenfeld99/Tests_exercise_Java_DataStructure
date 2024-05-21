package DataStract;

import java.util.Arrays;

public class Vector<T> {
    private int current;
    private T[] arr;

    public Vector() {
        arr = (T[]) new Object[2];
        current = 0;
    }

    public void add(T element) {
        arr[current++] = element;
        if (current == arr.length) doubleArraySize();
    }

    public void doubleArraySize() {
        T[] temp = (T[]) new Object[current * 2];
        for (int i = 0; i <current ; i++) {
           temp[i]=arr[i];
        }
        this.arr=temp;
    }

    public String toString(){
        return Arrays.toString(arr);
    }

    public int size(){
        return current;
    }
    public int capacity(){
        return arr.length;
    }

    public T get(int index){
        return arr[index];
    }

}
