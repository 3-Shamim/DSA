package com.learningstuff.ds.queue;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/2/24
 * Email: mdshamim723@gmail.com
 */

public class CustomQueue<T> {

    private final Object[] elements;
    private int end = 0;

    public CustomQueue() {
        elements = new Object[10];
    }

    public CustomQueue(int size) {
        elements = new Object[size];
    }

    public void add(T data) throws Exception {

        if (isFull()) {
            throw new Exception("Queue is full");
        }

        elements[end] = data;
        end++;
    }

    @SuppressWarnings("unchecked")
    public T remove() throws Exception {

        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        T data = (T) elements[0];

        for (int i = 1; i < end; i++) {
            elements[i - 1] = elements[i];
        }

        end--;

        return data;

    }

    @SuppressWarnings("unchecked")
    public T peek() throws Exception {

        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return (T) elements[0];
    }

    public boolean isFull() {
        return end == elements.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void display() {
        System.out.println("Queue is: " + Arrays.toString(elements));
    }

}
