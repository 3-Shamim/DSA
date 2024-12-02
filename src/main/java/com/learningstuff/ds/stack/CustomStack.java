package com.learningstuff.ds.stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class CustomStack<T> {

    protected Object[] data;
    private int pointer = -1;

    public CustomStack() {
    }

    public CustomStack(int size) {
        this.data = new Object[size];
    }

    public void push(T value) {

        if (isFull()) {
            System.out.println("Can't push value: " + value + ". Stack is full");
            return;
        }

        pointer++;
        data[pointer] = value;
    }

    @SuppressWarnings(value = "unchecked")
    public T pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        Object removed = data[pointer];
        pointer--;
        return (T) removed;
    }

    @SuppressWarnings(value = "unchecked")
    public T peek() {
        return (T) data[pointer];
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public boolean isFull() {
        return pointer == data.length - 1;
    }

}
