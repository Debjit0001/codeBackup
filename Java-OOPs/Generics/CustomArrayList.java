package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        // by default, create an array of DEFAULT_SIZE
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        // prior to adding, check if the arraylist is full
        if(this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        // is the array list is full, double its length
        int[] temp = new int[data.length * 2];

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

    public int remove() {
        // it actually doesn't remove the element, instead returns the element of the value at last index and then reduces the size element by 1;
        // now, as the size is 1 less, if we try to add new element to the arraylist, the previous last index will get over written
        int removed = data[size--];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value; 
    }

    @Override
    public String toString() {
        return "CustomArrayList" + " data = " + Arrays.toString(data) + " ,size = " + size + " ]";
    }
    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        // list.add(3);
        // list.add(5);
        // list.add(9);

        for (int i = 0; i < 15; i++) {
            list.add(2*i);
        }
        System.out.println(list.toString());

        // ArrayList list = new  ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1, 411);
        // list.size();
        // list.isEmpty();
        
    }
}
