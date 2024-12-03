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

        if (isFull()) {

            capacity = capacity * 2;

            Object[] temp = new Object[capacity];

            int i = 0;

            while (start != end) {
                temp[i++] = elements[start];
                start = (start % size) + 1;
            }

            start = 0;
            end = size;

            elements = temp;
        }

        return super.add(data);
    }

}
