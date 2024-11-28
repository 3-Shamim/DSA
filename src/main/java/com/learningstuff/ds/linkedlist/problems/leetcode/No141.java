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
 * Leetcode: https://leetcode.com/problems/merge-two-sorted-lists/description/
 * */

public class No141 {

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }

        }

        return false;
    }

    public static boolean hasCycle1(ListNode head) {

        Set<ListNode> visited = new HashSet<>();

        while (head != null) {

            if (visited.contains(head)) {
                return true;
            }

            visited.add(head);

            head = head.next;
        }

        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        ListNode n1 = new ListNode(2);
        head.next = n1;

        ListNode n2 = new ListNode(3);
        n1.next = n2;

        ListNode n3 = new ListNode(4);
        n2.next = n3;

        n3.next = head;

        System.out.println(hasCycle(head));


    }


}
