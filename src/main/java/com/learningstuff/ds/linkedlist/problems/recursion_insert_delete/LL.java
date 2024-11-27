package com.learningstuff.ds.linkedlist.problems.recursion_insert_delete;

import com.learningstuff.ds.linkedlist.impl.singly.SinglyNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class LL<T> {

    private SinglyNode<T> head = null;

    private SinglyNode<T> addFirst(T data) {
        head = new SinglyNode<>(data, head);
        return head;
    }

    private void delete(T data) {
        head = deleteRec(data, head);
    }

    private SinglyNode<T> deleteRec(T data, SinglyNode<T> head) {

        if (head.getData().equals(data)) {
            return head.getNext();
        }

        if (head.getNext() != null) {
            head.setNext(deleteRec(data, head.getNext()));
            return head;
        }

        return head;
    }

    private SinglyNode<T> insertAt(int index, T data) {

        return insertAt(index, data, head);
    }

    private SinglyNode<T> insertAt(int index, T data, SinglyNode<T> head) {

        if (index == 0) {
            return new SinglyNode<>(data, head);
        }

        head.setNext(insertAt(index - 1, data, head.getNext()));

        return head;
    }

    private void print() {

        SinglyNode<T> current = head;

        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }

        System.out.println("END");
    }

    public static void main(String[] args) {

        LL<Integer> l = new LL<>();
        System.out.println("ADD: " + l.addFirst(1));
        l.print();
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.print();

        l.delete(3);

        System.out.println(l.insertAt(2, 3));

        l.print();

    }

}
