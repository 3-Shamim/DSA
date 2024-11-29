package com.learningstuff.ds.linkedlist.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 11/29/24
 * Email: mdshamim723@gmail.com
 */

/*
 * Leetcode: https://leetcode.com/problems/middle-of-the-linked-list/description/
 * */

public class No876 extends LinkedListOperation {

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode middleNode2(ListNode head) {

        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        return list.get(list.size() / 2);
    }

    public static ListNode middleNode1(ListNode head) {

        ListNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        int mid = count / 2;

        while (mid > 0) {
            head = head.next;
            mid--;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode l1 = null;

        l1 = addFirst(4, l1);
        l1 = addFirst(3, l1);
        l1 = addFirst(2, l1);
        l1 = addFirst(1, l1);

        System.out.println(middleNode(l1));

    }

}
