package com.learningstuff.ds.linkedlist.problems.others;

import com.learningstuff.ds.linkedlist.problems.leetcode.LinkedListOperation;
import com.learningstuff.ds.linkedlist.problems.leetcode.ListNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class Reverse extends LinkedListOperation {


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
        display(rev);

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
        display(rev1);

        ListNode rev2 = reverse(head);
//        display(rev2);

    }

    private static ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        System.out.print(head + " - ");
        ListNode node = reverse(head.next);
        System.out.println(head);

        return head;
    }


}
