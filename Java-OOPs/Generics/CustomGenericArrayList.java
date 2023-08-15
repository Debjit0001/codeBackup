package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
 
    public CustomGenericArrayList() {
        // by default, create an array of DEFAULT_SIZE
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        // prior to adding, check if the arraylist is full
        if(this.isFull()) {          
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        // is the array list is full, double its length
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        // now update the actual array to the new array
        data = temp;
    }

    private boolean isFull() {
        // checks if the array is full or not
        return (size == data.length);
    }

    public T remove() {
        // it actually doesn't remove the element, instead returns the element of the value at last index and then reduces the size element by 1;
        // now, as the size is 1 less, if we try to add new element to the arraylist, the previous last index will get over written
        T removed = (T)(data[size--]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value; 
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList: \n" + " Data = " + Arrays.toString(data) + " \nSize = " + size ;
    }
    public static void main(String[] args) {

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();

        for (int i = 1; i <= 14; i++) {
            list.add(2*i);
        }        
        System.out.println(list.toString());
    }
}
