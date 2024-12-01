package com.learningstuff.ds.linkedlist.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/30/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/reorder-list/description/
 * */

public class No143 extends LinkedListOperation {

    public static void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = findMid(head);
        display(mid);
        mid = reverse(mid);
        display(mid);

        ListNode current = head;
        ListNode tail = null;

        while (current != null) {

            if (tail== null) {
                tail = current;
            } else {
                tail.next = current;
                tail = tail.next;
            }

            current = current.next;

            tail.next = mid;
            tail = mid;
            mid = mid.next;

        }

    }

    private static ListNode reverse(ListNode head) {

        ListNode rev = null;

        while (head != null) {

            ListNode temp = head;
            head = head.next;

            temp.next = rev;
            rev = temp;

        }

        return rev;
    }

    private static ListNode findMid(ListNode head) {

        ListNode slow = null;

        while (head != null && head.next != null) {
            if (slow == null) {
                slow = head;
            } else {
                slow = slow.next;
            }
            head = head.next.next;
        }

        ListNode mid = slow.next;

        slow.next = null;

        return mid;
    }

    public static void reorderList1(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> arr = new ArrayList<>();

        ListNode tail = head;
        ListNode next = head.next;

        while (next != null) {
            arr.add(next);
            next = next.next;
        }

        int l = 0;
        int r = arr.size() - 1;

        while (l < r) {

            ListNode right = arr.get(r);
            right.next = arr.get(l);

            tail.next = right;
            tail = right.next;
            tail.next = null;

            l++;
            r--;
        }

        if (arr.size() % 2 == 1) {
            ListNode mid = arr.get(arr.size() / 2);
            tail.next = mid;
            tail = mid;
            tail.next = null;
        }

    }

    public static void main(String[] args) {

        ListNode head = null;
        head = addElements(head, 5);
        display(head);
        reorderList(head);
        display(head);

    }

}
