package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/27/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/merge-two-sorted-lists/description/
 * */

public class No21 extends LinkedListOperation {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode tail = null;

        while (list1 != null) {

            while (list2 != null) {

                if (list2.val > list1.val) {
                    break;
                }

                if (head == null) {
                    head = list2;
                }

                if (tail != null) {
                    tail.next = list2;
                }

                tail = list2;

                list2 = list2.next;
            }

            if (head == null) {
                head = list1;
            }

            if (tail != null) {
                tail.next = list1;
            }

            tail = list1;

            list1 = list1.next;

        }

        // Remaining elements
        if (head == null) {
            head = list2;
        } else {
            tail.next = list2;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode l1 = null;
        ListNode l2 = null;

        l1 = addFirst(3, l1);
        l1 = addFirst(3, l1);
        l1 = addFirst(3, l1);
        l1 = addFirst(2, l1);
        l1 = addFirst(1, l1);

        l2 = addFirst(4, l2);
        l2 = addFirst(3, l2);
        l2 = addFirst(2, l2);
        l2 = addFirst(1, l2);

        display(l1);
        display(l2);

        ListNode finalNode = mergeTwoLists(l1, l2);

        display(finalNode);

    }

}
