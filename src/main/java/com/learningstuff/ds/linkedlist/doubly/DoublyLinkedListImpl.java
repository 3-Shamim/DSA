package com.learningstuff.ds.linkedlist.doubly;

import com.learningstuff.ds.linkedlist.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/25/24
 * Email: mdshamim723@gmail.com
 */

public class DoublyLinkedListImpl<T> implements LinkedList<T> {

    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;

    @Override
    public void addFirst(T data) {

        DoublyNode<T> node = new DoublyNode<>(data);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;

    }

    @Override
    public void addLast(T data) {

        DoublyNode<T> node = new DoublyNode<>(data);

        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;

    }

    @Override
    public void addAtIndex(int index, T data) {

    }

    @Override
    public int getIndex(T data) {
        return 0;
    }

    @Override
    public T getByIndex(int index) {
        return null;
    }

    @Override
    public T get(T data) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void print() {

        DoublyNode<T> current = head;

        while (current != null) {

            System.out.print(current.getData() + " -> ");

            current = current.getNext();
        }

        System.out.println("END");

    }

    @Override
    public void printTail() {

        System.out.println(tail);

    }


}
