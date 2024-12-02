package com.learningstuff.ds.stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class DynamicStack<T> extends CustomStack<T> {

    private int size = 10;

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
        this.size = size;
    }

    @Override
    public void push(T value) {

        if (super.isFull()) {

            size = size * 2;

            Object[] temp = new Object[size];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        super.push(value);
    }

}
