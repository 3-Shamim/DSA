package com.learningstuff.ds.queue;

import com.learningstuff.ds.linkedlist.impl.singly.SinglyNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class CustomQueue<T> {

    private SinglyNode<T> head = null;
    private SinglyNode<T> tail = null;

    public void add(T data) {

        if (tail == null) {
            head = new SinglyNode<>(data);
            tail = head;
        } else {
            SinglyNode<T> node = new SinglyNode<>(data);
            tail.setNext(node);
            tail = node;
        }

    }

    public T peek() {

        if (head == null) {
            System.out.println("Queue is empty");
            return null;
        }

        return head.getData();
    }

    public T remove() {

        if (head == null) {
            System.out.println("Queue is empty");
            return null;
        }

        SinglyNode<T> node = head;
        head = head.getNext();

        return node.getData();
    }

    public void display() {

        SinglyNode<T> current = head;

        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }

        System.out.println("END");
    }

}
