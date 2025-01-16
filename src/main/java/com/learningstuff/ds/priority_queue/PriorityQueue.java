package com.learningstuff.ds.priority_queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/15/25
 * Email: mdshamim723@gmail.com
 */

// Using min heap
public class PriorityQueue<T extends Comparable<T>> {

    private final List<T> list;

    public PriorityQueue() {
        list = new ArrayList<T>();
    }

    public void insert(T element) {
        list.add(element);
        upHeap(list, list.size() - 1);
    }

    private void upHeap(List<T> list, int index) {

        int parent = getParent(index);

        if (list.get(index).compareTo(list.get(parent)) < 0) {
            T temp = list.get(index);
            list.set(index, list.get(parent));
            list.set(parent, temp);
            upHeap(list, parent);
        }

    }

    public T remove() {

        if (list.isEmpty()) {
            return null;
        }

        T removedItem = list.get(0);
        T last = list.remove(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(list, 0);
        }

        return removedItem;
    }

    private void downHeap(List<T> list, int index) {

        int minIndex = index;
        int left = getLeft(index);
        int right = getRight(index);

        if (left < list.size() && list.get(left).compareTo(list.get(minIndex)) < 0) {
            minIndex = left;
        }

        if (right < list.size() && list.get(right).compareTo(list.get(minIndex)) < 0) {
            minIndex = right;
        }

        if (minIndex != index) {

            T temp = list.get(index);
            list.set(index, list.get(minIndex));
            list.set(minIndex, temp);

            downHeap(list, minIndex);

        }

    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getLeft(int index) {
        return (2 * index) + 1;
    }

    private int getRight(int index) {
        return (2 * index) + 2;
    }

    public void display() {
        System.out.println(list);
    }

}
