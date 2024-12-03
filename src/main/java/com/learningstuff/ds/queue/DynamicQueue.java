package com.learningstuff.ds.queue;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/2/24
 * Email: mdshamim723@gmail.com
 */

public class DynamicQueue<T> extends CircularQueue<T> {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int capacity) {
        super(capacity);
    }

    @Override
    public boolean add(T data) {

        if (super.isFull()) {

            super.capacity = super.capacity * 2;

            Object[] temp = new Object[super.capacity];

            for (int i = 0; i < super.size; i++) {
                temp[super.size + i] = super.elements[super.size + i];
            }

            super.elements = temp;
        }

        return super.add(data);
    }

}
