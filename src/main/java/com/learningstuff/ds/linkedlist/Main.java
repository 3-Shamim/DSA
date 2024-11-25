package com.learningstuff.ds.linkedlist;

import com.learningstuff.ds.linkedlist.doubly.DoublyLinkedList;
import com.learningstuff.ds.linkedlist.doubly.DoublyLinkedListImpl;
import com.learningstuff.ds.linkedlist.singly.SinglyLinkedListImpl;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/23/24
 * Email: mdshamim723@gmail.com
 */

public class Main {

    public static void main(String[] args) {

//        singly();
        doubly();

    }

    private static void doubly() {

        DoublyLinkedList<Integer> l = new DoublyLinkedListImpl<>();

        l.addFirst(1);
        l.addFirst(2);

        l.addLast(3);
        l.addLast(4);
        l.addLast(5);

        l.print();

        l.addAtIndex(2, 8);

        l.print();

        l.remove(3);

        l.print();

        System.out.println("Remove: " + l.removeFirst());
        System.out.println("Remove: " + l.removeFirst());
        System.out.println("Remove: " + l.removeFirst());
        System.out.println("Remove: " + l.removeFirst());
        System.out.println("Remove: " + l.removeFirst());

        l.remove(5);

        l.print();

        l.addFirst(1);
        l.addFirst(2);

        System.out.println();
        System.out.println(l.getSize());
        System.out.println(l.getIndex(2));
        System.out.println(l.getByIndex(l.getIndex(2)));

        l.print();
        l.printReverse();

    }

    private static void singly() {

        LinkedList<Integer> l = new SinglyLinkedListImpl<>();

        l.addFirst(1);
        l.addFirst(2);

        l.addLast(3);
        l.addLast(4);
        l.addLast(5);

        l.print();

        l.addAtIndex(2, 8);

        l.print();

        l.remove(3);

        l.print();

        l.removeFirst();
        l.removeFirst();
        l.removeFirst();
        l.removeFirst();

        l.remove(5);

        l.print();

        l.addFirst(1);
        l.addFirst(2);

        System.out.println();
        System.out.println(l.getSize());
        System.out.println(l.getIndex(2));
        System.out.println(l.getByIndex(l.getIndex(2)));

    }

}
