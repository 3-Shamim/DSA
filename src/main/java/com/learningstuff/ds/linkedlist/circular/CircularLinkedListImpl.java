package com.learningstuff.ds.linkedlist.circular;

import com.learningstuff.ds.linkedlist.LinkedList;
import com.learningstuff.ds.linkedlist.singly.SinglyNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/23/24
 * Email: mdshamim723@gmail.com
 */
public class CircularLinkedListImpl<T> implements LinkedList<T> {

    private SinglyNode<T> head;
    private SinglyNode<T> tail;
    private int size;

    @Override
    public void addFirst(T data) {

        SinglyNode<T> node = new SinglyNode<>(data, head);

        if (head == null) {
            tail = node;
        }

        head = node;

        size++;

    }

    @Override
    public void addLast(T data) {

        if (head == null) {
            addFirst(data);
            return;
        }

        SinglyNode<T> node = new SinglyNode<>(data, null);
        tail.setNext(node);
        tail = node;

        size++;

    }

    @Override
    public void addAtIndex(int index, T data) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Index out of bounds. Current size is " + size
            );
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        SinglyNode<T> current = head;

        int i = 0;

        while (current != null) {

            if (i == index - 1) {
                SinglyNode<T> node = new SinglyNode<>(data, current.getNext());
                current.setNext(node);
                break;
            }

            current = current.getNext();
            i++;
        }

        size++;

    }

    @Override
    public int getIndex(T data) {

        int index = 0;

        SinglyNode<T> current = head;

        while (current != null) {

            if (data == current.getData()) {
                return index;
            }

            current = current.getNext();
            index++;

        }


        return -1;
    }

    @Override
    public T getByIndex(int index) {

        int i = 0;

        SinglyNode<T> current = head;

        while (current != null) {

            if (i == index) {
                return current.getData();
            }

            current = current.getNext();
            i++;

        }

        return null;
    }

    @Override
    public T get(T data) {

        SinglyNode<T> current = head;

        while (current != null) {

            if (data == current.getData()) {
                return current.getData();
            }

            current = current.getNext();

        }

        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T removeFirst() {

        if (head == null) {
            return null;
        }

        T data = head.getData();

        head = head.getNext();
        size--;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    @Override
    public void remove(T data) {

        SinglyNode<T> current = head;
        SinglyNode<T> previous = null;

        while (current != null) {

            if (data == current.getData()) {

                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }

                size--;

                break;

            }

            previous = current;
            current = current.getNext();

        }

        if (head == null) {
            tail = null;
        }


    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void print() {

        SinglyNode<T> current = head;

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
