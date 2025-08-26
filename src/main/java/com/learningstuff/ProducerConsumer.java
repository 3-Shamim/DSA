package com.learningstuff;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class ProducerConsumer {

    public static void main(String[] args) {

        Worker worker = new Worker(10);

        Thread producer = new Thread(() -> {

            try {
                worker.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread consumer = new Thread(() -> {

            try {
                worker.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        producer.start();
        consumer.start();


    }

}

class Worker {

    private int sec = 1;
    private final int limit;
    private final List<Integer> container = new ArrayList<>();
    private final Object lock = new Object();

    public Worker(int limit) {
        this.limit = limit;
    }

    public void produce() throws InterruptedException {

        while (true) {

            synchronized (lock) {

                if (container.size() == limit) {
                    System.out.println("Container is full");
                    lock.wait(); // wait until consumption
                } else {
                    System.out.println("Producing: " + sec);
                    container.add(sec++);
                    lock.notifyAll();
                }

            }

        }

    }

    public void consume() throws InterruptedException {

        while (true) {

            synchronized (lock) {

                if (container.isEmpty()) {
                    System.out.println("Container is empty");
                    lock.wait(); // wait until produce
                } else {
                    System.out.println("Consuming: " + container.remove(0));
                    lock.notifyAll();
                }

            }

        }

    }

}