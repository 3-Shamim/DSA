package com.learningstuff.ds.queue;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/2/24
 * Email: mdshamim723@gmail.com
 */

public class CircularQueueMain {

    public static void main(String[] args) {

        CircularQueue<Integer> circularQueue = new CircularQueue<>(5);

        System.out.println("Add: " + circularQueue.add(1));
        System.out.println("Add: " + circularQueue.add(2));
        System.out.println("Add: " + circularQueue.add(3));
        System.out.println("Add: " + circularQueue.add(4));
        System.out.println("Add: " + circularQueue.add(5));

        circularQueue.display();

        System.out.println("Peek: " + circularQueue.peek());
        System.out.println("Add: " + circularQueue.add(6));
        System.out.println("Add: " + circularQueue.add(7));

        circularQueue.display();

        System.out.println("Remove: " + circularQueue.remove());
        System.out.println("Remove: " + circularQueue.remove());

        System.out.println("Peek: " + circularQueue.peek());

        System.out.println("Add: " + circularQueue.add(6));
        System.out.println("Add: " + circularQueue.add(7));

        circularQueue.display();

        System.out.println("Remove: " + circularQueue.remove());
        System.out.println("Remove: " + circularQueue.remove());

        System.out.println("Peek: " + circularQueue.peek());

        System.out.println("Remove: " + circularQueue.remove());
        System.out.println("Remove: " + circularQueue.remove());

        circularQueue.display();

        System.out.println("Remove: " + circularQueue.remove());
        System.out.println("Remove: " + circularQueue.remove());

        circularQueue.display();

    }

}
