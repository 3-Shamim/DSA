package com.learningstuff.ds.linkedlist.problems.others;

import com.learningstuff.ds.linkedlist.problems.leetcode.LinkedListOperation;
import com.learningstuff.ds.linkedlist.problems.leetcode.ListNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class Reverse extends LinkedListOperation {

    private static ListNode test;

    public static void main(String[] args) {

        // First way
        // Create new node (Taking O(n) extra space)
        ListNode head = null;
        head = addElements(head, 5);

        display(head);

        ListNode rev = null;

        ListNode current = head;

        while (current != null) {
            rev = addFirst(current.val, rev);
            current = current.next;
        }

        head = rev;
        display(head);

        // Second way
        // User existing node (Memory efficient)
        ListNode rev1 = null;

        while (head != null) {

            ListNode temp = head;
            head = head.next;

            temp.next = rev1;
            rev1 = temp;

        }

        head = rev1;
        display(head);

    }

}
