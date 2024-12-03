package com.learningstuff.ds.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class Main {

    public static void main(String[] args) throws Exception {

        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();

        linkedListQueue.add(1);
        linkedListQueue.add(2);
        linkedListQueue.add(3);

        linkedListQueue.display();

        System.out.println(linkedListQueue.peek());

        System.out.println(linkedListQueue.remove());

        linkedListQueue.display();

        System.out.println(linkedListQueue.remove());
        System.out.println(linkedListQueue.remove());
        System.out.println(linkedListQueue.remove());
        System.out.println(linkedListQueue.peek());

        CustomQueue<Integer> customQueue = new CustomQueue<>(3);
        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        customQueue.display();
        System.out.println("Get First: " + customQueue.peek());

        System.out.println("Removed: " + customQueue.remove());
        System.out.println("Removed: " + customQueue.remove());
        System.out.println("Removed: " + customQueue.remove());
        System.out.println("Removed: " + customQueue.remove());

        // Java implementations
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> dequeLinkedList = new LinkedList<>();
        // Array based
        Deque<Integer> dequeArray = new ArrayDeque<>();

    }

}
