package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/reverse-linked-list/description/
 * */

public class No206 extends LinkedListOperation {

    public static ListNode reverseList(ListNode head) {

        ListNode rev1 = null;

        while (head != null) {

            ListNode temp = head;
            head = head.next;

            temp.next = rev1;
            rev1 = temp;

        }

        return rev1;
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = addElements(head, 5);

        display(head);

        head = reverseList(head);

        display(head);

    }

}
