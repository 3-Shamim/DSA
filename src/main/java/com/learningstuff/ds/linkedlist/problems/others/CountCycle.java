package com.learningstuff.ds.linkedlist.problems.others;

import com.learningstuff.ds.linkedlist.problems.leetcode.ListNode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class CountCycle {

    private static int countCycle(ListNode head) {

        int count = 0;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {

                do {
                    count++;
                    slow = slow.next;
                } while (slow != fast);

                break;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        ListNode n1 = new ListNode(2);
        head.next = n1;

        ListNode n2 = new ListNode(3);
        n1.next = n2;

        ListNode n3 = new ListNode(4);
        n2.next = n3;

        n3.next = head;

        System.out.println(countCycle(head));

    }

}
