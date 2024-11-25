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

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(data);
        }

        if (index == size) {
            addLast(data);
        }

        int i = 0;
        DoublyNode<T> current = head;

        while (current != null) {

            if (i == index - 1) {

                DoublyNode<T> node = new DoublyNode<>(data);
                node.setPrevious(current);
                DoublyNode<T> cNext = current.getNext();
                node.setNext(cNext);

                if (cNext != null) {
                    cNext.setPrevious(node);
                }

                current.setNext(node);

                break;
            }

            i++;
            current = current.getNext();
        }

    }

    @Override
    public int getIndex(T data) {

        DoublyNode<T> current = head;

        int index = 0;

        while (current != null) {

            if (current.getData().equals(data)) {
                return index;
            }

            index++;
            current = current.getNext();
        }

        return -1;
    }

    @Override
    public T getByIndex(int index) {

        DoublyNode<T> current = head;

        int _index = 0;

        while (current != null) {

            if (_index == index) {
                return current.getData();
            }

            _index++;
            current = current.getNext();
        }

        return null;
    }

    @Override
    public T get(T data) {

        DoublyNode<T> current = head;

        while (current != null) {

            if (current.getData().equals(data)) {
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

        DoublyNode<T> current = head;
        DoublyNode<T> previous = null;

        while (current != null) {

            if (current.getData().equals(data)) {

                if (previous == null) {
                    head = head.getNext();
                } else {
                    previous.setNext(current.getNext());
                }

                break;
            }

            previous = current;
            current = current.getNext();

        }

        size--;

    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
