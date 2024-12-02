package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 12/1/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * */

public class No61 extends LinkedListOperation {

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        // calculate minimum rotation
        k = k % count;

        // if zero no rotation required
        if (k == 0) {
            return head;
        }

        // Left partition node count
        k = (count - k);

        // find left partition tail
        ListNode lTail = head;

        while (--k != 0) {
            lTail = lTail.next;
        }

        // Rotate only right partition
        ListNode rHead = lTail.next;
        ListNode rTail = rHead;
        lTail.next = null;

        while (rTail.next != null) {
            rTail = rTail.next;
        }

        rTail.next = head;

        head = rHead;

        return head;
    }

    public static ListNode rotateRight1(ListNode head, int k) {

        if (k == 0) {
            return head;
        }

        if (head == null || head.next == null) {
            return head;
        }

        ListNode secondLast = findSecondLast(head);
        ListNode tail = secondLast.next;

        secondLast.next = null;
        tail.next = head;

        return rotateRight(tail, k - 1);
    }

    private static ListNode findSecondLast(ListNode head) {

        ListNode tail = null;

        while (head != null && head.next != null) {
            tail = head;
            head = head.next;
        }

        return tail;
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = addElements(head, 5);

        display(head);

        head = rotateRight(head, 8);

        display(head);


    }

}
