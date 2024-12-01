package com.learningstuff.ds.linkedlist.problems.leetcode;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/palindrome-linked-list/description/
 * */

public class No234 extends LinkedListOperation {

    public static void main(String[] args) {

        ListNode head = null;

        head = addFirst(1, head);
        head = addFirst(2, head);
        head = addFirst(1, head);

        display(head);

        System.out.println(isPalindrome(head));

    }

    private static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode right = findMid(head);
        ListNode rHead = null;

        while (right != null) {

            ListNode temp = right;
            right = right.next;

            temp.next = rHead;
            rHead = temp;

        }

        while (head != null) {

            if (head.val != rHead.val) {
                return false;
            }

            rHead = rHead.next;
            head = head.next;

        }

        return true;
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

    private static boolean isPalindrome1(ListNode head) {

        ListNode rev = reverse(head);

        while (head != null) {

            if (head.val != rev.val) {
                return false;
            }

            rev = rev.next;
            head = head.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode head) {

        ListNode rev = null;

        while (head != null) {
            rev = new ListNode(head.val, rev);
            head = head.next;
        }

        return rev;
    }

}
