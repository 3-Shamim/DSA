package com.learningstuff.ds.queue;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/2/24
 * Email: mdshamim723@gmail.com
 */

public class CircularQueue<T> {

    protected Object[] elements;

    protected int capacity = 10;

    protected int start = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this.elements = new Object[capacity];
    }

    public CircularQueue(int capacity) {
        this.elements = new Object[capacity];
        this.capacity = capacity;
    }

    public boolean add(T data) {

        if (isFull()) {
            return false;
        }

        int mod = end % capacity;
        elements[mod++] = data;
        end = mod;

        size++;

        return true;
    }

    @SuppressWarnings("unchecked")
    public T peek() {

        if (isEmpty()) {
            return null;
        }

        return (T) elements[start];
    }


    @SuppressWarnings("unchecked")
    public T remove() {

        if (isEmpty()) {
            return null;
        }

        int mod = start % capacity;

        T data = (T) elements[mod++];
        start = mod;
        size--;

        return data;
    }

    protected boolean isFull() {
        return size == capacity;
    }

    protected boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[(start + i) % capacity] + " ");
        }
        System.out.println();
    }

}
