package com.learningstuff.ds.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/8/24
 * Time: 7:45 AM
 * Email: mdshamim723@gmail.com
 */

public interface LinkedList<T> {

    void addFirst(T data);

    void addLast(T data);

    void addAtIndex(int index, T data);

    int getIndex(T data);

    T getByIndex(int index);

    T get(T data);

    int getSize();

    void removeFirst();

    void remove(T data);

    void clear();

    boolean isEmpty();

    void print();

}
