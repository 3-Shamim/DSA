package com.learningstuff;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class WaitNotify {

    private static final Object LOCK = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                method1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(WaitNotify::method2);

        t1.start();
        t2.start();

    }

    private static void method1() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("method1");
            LOCK.wait();
            System.out.println("method1 after wait");
        }
    }


    private static void method2() {
        synchronized (LOCK) {
            System.out.println("method2");
            LOCK.notify();
            System.out.println("method2 after notify");
        }
    }


}
