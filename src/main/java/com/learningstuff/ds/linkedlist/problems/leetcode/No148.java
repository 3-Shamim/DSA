package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

public class No148 extends LinkedListOperation {

    public static ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private static ListNode mergeSort(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMid(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);

        return merge(left, right);
    }

    private static ListNode merge(ListNode l1, ListNode l2) {

        ListNode h = null;
        ListNode tail = null;

        while (l1 != null) {

            while (l2 != null) {

                if (l2.val > l1.val) {
                    break;
                } else {
                    if (h == null) {
                        h = l2;
                    } else {
                        tail.next = l2;
                    }
                    tail = l2;
                }

                l2 = l2.next;
            }

            if (h == null) {
                h = l1;
            } else {
                tail.next = l1;
            }

            tail = l1;

            l1 = l1.next;
        }

        if (h == null) {
            h = l2;
        } else {
            tail.next = l2;
        }

        return h;
    }

    private static ListNode findMid(ListNode fast) {
        ListNode midPrev = null;
        while (fast != null && fast.next != null) {
            midPrev = midPrev == null ? fast : midPrev.next;
            fast = fast.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }

    public static void main(String[] args) {

        ListNode l1 = null;

        l1 = addFirst(2, l1);
        l1 = addFirst(1, l1);
        l1 = addFirst(4, l1);
        l1 = addFirst(3, l1);

        display(l1);
        l1 = sortList(l1);
        display(l1);

    }

}
