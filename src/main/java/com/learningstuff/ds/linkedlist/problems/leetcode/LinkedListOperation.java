package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

public class LinkedListOperation {

    public static ListNode addFirst(int v, ListNode head) {

        ListNode node = new ListNode(v);
        node.next = head;

        return node;
    }

    public static ListNode addReverseElements(ListNode head, int k) {

        for (int i = 1; i <= k; i++) {
           head = addFirst(i, head);
        }

        return head;
    }

    public static ListNode addElements(ListNode head, int k) {

        while (k > 0) {
            head = addFirst(k, head);
            k--;
        }

        return head;
    }

    public static void display(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("END");
    }

}
