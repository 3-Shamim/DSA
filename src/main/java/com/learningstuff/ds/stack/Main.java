package com.learningstuff.ds.stack;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class Main {

    public static void main(String[] args) {

        CustomStack<Integer> stack = new CustomStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());

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

    }

}
