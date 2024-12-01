package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/reverse-linked-list-ii/description/
 * */

public class No92 extends LinkedListOperation {

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null) {
            return head;
        }

        int i = 1;

        ListNode current = head;
        ListNode previous = null;

        while (current != null) {

            if (i == left) {

                ListNode rHead = null;
                ListNode rTail = current;

                while (current != null && i <= right) {

                    ListNode temp = current;

                    i++;
                    current = current.next;

                    temp.next = rHead;
                    rHead = temp;

                }

                if (previous != null) {
                    previous.next = rHead;
                } else {
                    head = rHead;
                }

                rTail.next = current;

                break;
            }

            i++;
            previous = current;
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = addElements(head, 2);

        display(head);

        head = reverseBetween(head, 1, 2);

        display(head);

    }

}
