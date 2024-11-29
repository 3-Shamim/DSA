package com.learningstuff.ds.linkedlist.problems.others;

import com.learningstuff.ds.linkedlist.problems.leetcode.LinkedListOperation;
import com.learningstuff.ds.linkedlist.problems.leetcode.ListNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

public class ReverseRecursion extends LinkedListOperation {

    private static ListNode head;
    private static ListNode tail;

    public static void main(String[] args) {

        head = addFirst(5, head);
        tail = head;

        head = addElements(head, 4);

        display(head);
        reverse(head);
        display(head);

    }

    private static void reverse(ListNode node) {

        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

}
