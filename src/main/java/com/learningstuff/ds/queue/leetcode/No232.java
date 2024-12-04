package com.learningstuff.ds.queue.leetcode;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/4/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/implement-queue-using-stacks/description/
 * */

public class No232 {

    public static void main(String[] args) {

        MyQueue obj = new MyQueue();
        obj.push(1);
        int param_2 = obj.pop();
        System.out.println(param_2);
        int param_3 = obj.peek();
        System.out.println(param_3);
        boolean param_4 = obj.empty();
        System.out.println(param_4);

    }

}

class MyQueue {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> supporting = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {

        if (main.empty()) {
            main.push(x);
            supporting.push(x);
        } else {
            main.push(x);
        }

    }

    public int pop() {

        int data = supporting.pop();

        while (!main.empty()) {

            Integer last = main.pop();

            if (main.empty()) {
                break;
            }

            supporting.push(last);

        }

        int second = -1;

        while (!supporting.empty()) {

            int last = supporting.pop();

            if (second == -1) {
                second = last;
            }

            main.push(last);

        }

        if (second != -1) {
            supporting.push(second);
        }

        return data;
    }

    public int peek() {
        return supporting.peek();
    }

    public boolean empty() {
        return main.empty();
    }

}
