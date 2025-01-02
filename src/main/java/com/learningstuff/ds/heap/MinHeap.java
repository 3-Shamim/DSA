package com.learningstuff.ds.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/1/25
 * Email: mdshamim723@gmail.com
 */

public class MinHeap {

    private final List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {

        heap.add(value);

        upHeap(heap.size() - 1);

    }

    private void upHeap(int i) {

        if (i == 0) {
            return;
        }

        int parent = getParent(i);

        if (heap.get(parent) > heap.get(i)) {
            swap(parent, i);
            upHeap(parent);
        }

    }

    public int deleteFirst() {

        if (heap.isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        }

        Integer data = heap.get(0);

        Integer last = heap.remove(heap.size() - 1);

        if (heap.isEmpty()) {
            return data;
        }

        heap.set(0, last);

        downHeap(0);

        return data;
    }

    private void downHeap(int i) {

        int left = getLeft(i);
        int right = getRight(i);

        int min = i;

        if (left < heap.size() && heap.get(left) < heap.get(min)) {
            min = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(min)) {
            min = right;
        }

        if (min != i) {
            swap(min, i);
            downHeap(min);
        }

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

    private void swap(int i, int j) {

        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);

    }

    public void heapify(List<Integer> list) {

        heap.addAll(list);

        int len = heap.size() / 2;

        heapify(len - 1);

    }

    private void heapify(int i) {

        if (i < 0) {
            return;
        }

        int left = getLeft(i);
        int right = getRight(i);

        int min = i;

        if (left < heap.size() && heap.get(min) > heap.get(left)) {
            min = left;
        }

        if (right < heap.size() && heap.get(min) > heap.get(right)) {
            min = right;
        }

        swap(min, i);

        heapify(i - 1);

    }

    public void display() {
        System.out.println(heap);
    }

    public static void main(String[] args) {

        MinHeap min = new MinHeap();

        for (int i = 4; i > 0; i--) {
            min.insert(i);
        }

        System.out.println(min.heap);

        min.deleteFirst();

        System.out.println(min.heap);


    }

}
