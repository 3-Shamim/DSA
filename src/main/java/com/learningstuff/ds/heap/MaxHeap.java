package com.learningstuff.ds.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/1/25
 * Email: mdshamim723@gmail.com
 */

public class MaxHeap {

    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {

        heap.add(value);

        upHeap(heap, heap.size() - 1);

    }

    private void upHeap(List<Integer> heap, int i) {

        int parent = getParent(i);

        if (i == 0 || heap.get(parent) > heap.get(i)) {
            return;
        }

        swap(heap, i, parent);

        upHeap(heap, parent);

    }

    public int deleteFirst() {

        Integer temp = heap.get(0);

        Integer remove = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, remove);
        }

        downHeap(heap, 0);

        return temp;
    }

    private void downHeap(List<Integer> heap, int i) {

        int max = i;
        int left = getLeft(i);
        int right = getRight(i);

        if (left < heap.size() && heap.get(left) > heap.get(max)) {
            max = left;
        }

        if (right < heap.size() && heap.get(right) > heap.get(max)) {
            max = right;
        }

        if (max != i) {
            swap(heap, max, i);
            downHeap(heap, max);
        }

    }

    private void swap(List<Integer> heap, int i, int parent) {
        int temp = heap.get(i);
        heap.set(i, heap.get(parent));
        heap.set(parent, temp);
    }

    private int getParent(int i) {
        return (i - 1) / 2;
    }

    private int getLeft(int i) {
        return 2 * i + 1;
    }

    private int getRight(int i) {
        return 2 * i + 2;
    }

    public static void main(String[] args) {

        MaxHeap max = new MaxHeap();

        for (int i = 1; i <= 4; i++) {
            max.insert(i);
        }

        System.out.println(max.heap);

        max.deleteFirst();

        System.out.println(max.heap);

    }

}
