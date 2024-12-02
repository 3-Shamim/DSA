package com.learningstuff.ds.stack;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class Main {

    public static void main(String[] args) {

        CustomStack<Integer> customStack = new CustomStack<>(3);
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);

        System.out.println(customStack.peek());

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

        System.out.println(customStack.pop());

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Dynamic Stack");
        System.out.println("==============================================");
        System.out.println();

        DynamicStack<Integer> dynamicStack = new DynamicStack<>(3);
        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5);
        dynamicStack.push(6);
        dynamicStack.push(7);
        dynamicStack.push(8);
        dynamicStack.push(9);

        System.out.println(dynamicStack.peek());

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());

        // Java implementations
        Stack<Integer> stack = new Stack<>();

    }

}
