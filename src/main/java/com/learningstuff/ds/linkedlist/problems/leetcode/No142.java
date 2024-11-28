package com.learningstuff.ds.linkedlist.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/28/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/linked-list-cycle-ii/description/
 * */

public class No142 {

    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        int len = 0;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                do {
                    len++;
                    slow = slow.next;
                } while (slow != fast);

                break;
            }

        }

        if (len == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;

        while (len > 0) {
            s = s.next;
            len--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }

    public static ListNode detectCycle1(ListNode head) {

        Set<ListNode> visited = new HashSet<>();

        while (head != null) {

            if (visited.contains(head)) {
                return head;
            }

            visited.add(head);

            head = head.next;
        }

        return null;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        ListNode n1 = new ListNode(2);
        head.next = n1;

        ListNode n2 = new ListNode(3);
        n1.next = n2;

        ListNode n3 = new ListNode(4);
        n2.next = n3;

        ListNode n4 = new ListNode(5);
        n3.next = n4;

        ListNode n5 = new ListNode(6);
        n4.next = n5;

        n5.next = n1;

        System.out.println(detectCycle(head));

    }

}
