package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/30/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * */

public class No25 extends LinkedListOperation {

    public static ListNode reverseKGroup(ListNode head, int k) {

        // Partition head + tail
        ListNode pHead = head;
        ListNode pTail = null;

        // Reverse sublist
        ListNode rev = null;

        int count = 0;
        ListNode current = head;

        while (current != null) {

            count++;

            ListNode temp = current;

            current = current.next;

            temp.next = rev;
            rev = temp;

            if (count % k == 0) {

                if (pTail == null) {
                    head = rev;
                } else {
                    pTail.next = rev;
                }

                pTail = pHead;
                pHead = current;

                rev = null;

            }

        }

        if (pTail != null) {
            pTail.next = reverse(rev);
        }

        return head;
    }

    public static ListNode reverseKGroup1(ListNode head, int k) {

        int count = 0;

        // Partition head + tail
        ListNode pHead = head;
        ListNode pTail = null;

        ListNode current = head;

        while (current != null) {

            count++;

            ListNode temp = current;

            current = current.next;

            if (count % k == 0) {

                // Separate the partition
                temp.next = null;

                ListNode rev = reverse(pHead);

                if (pTail == null) {
                    head = rev;
                } else {
                    pTail.next = rev;
                }

                pTail = pHead;
                pHead = current;

            }

        }

        // Remaining nodes after partition
        if (pTail != null) {
            pTail.next = pHead;
        }

        return head;
    }

    private static ListNode reverse(ListNode head) {

        ListNode root = null;

        while (head != null) {

            ListNode temp = head;
            head = head.next;
            temp.next = root;
            root = temp;

        }

        return root;
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = addElements(head, 5);

        display(head);

        head = reverseKGroup(head, 3);

        display(head);

    }

}
