package com.learningstuff.ds.linkedlist;

import com.learningstuff.ds.linkedlist.singly.SinglyLinkedListImpl;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/23/24
 * Email: mdshamim723@gmail.com
 */

public class Main {

    public static void main(String[] args) {

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

        System.out.println(l.getSize());

    }

}
