package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/27/24
 * Email: mdshamim723@gmail.com
 */

/*
* Leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
* */

public class No83 {

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }

        return head;
    }

    public static ListNode deleteDuplicatesRec(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode next = head.next;

        while (next != null && current.val == next.val) {
            next = next.next;
            current = current.next;
        }

        current.next = deleteDuplicates(current.next);

        return current;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        head.next = node;
        ListNode node1 = new ListNode(2);
        node.next = node1;
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = new ListNode(3);

        display(head);

        head = deleteDuplicates(head);

        display(head);

    }

    private static void display(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("END");
    }


}

