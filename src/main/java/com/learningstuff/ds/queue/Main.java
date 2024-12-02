package com.learningstuff.ds.queue;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class Main {

    public static void main(String[] args) {

        CustomQueue<Integer> customQueue = new CustomQueue<>();

        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        customQueue.display();

        System.out.println(customQueue.peek());

        System.out.println(customQueue.remove());

        customQueue.display();

        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.remove());
        System.out.println(customQueue.peek());


        // Java implementations
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> dequeLinkedList = new LinkedList<>();
        // Array based
        Deque<Integer> dequeArray = new ArrayDeque<>();

    }

}
