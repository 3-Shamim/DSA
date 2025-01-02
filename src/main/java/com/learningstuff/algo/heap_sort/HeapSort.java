package com.learningstuff.algo.heap_sort;

import com.learningstuff.ds.heap.MinHeap;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/2/25
 * Email: mdshamim723@gmail.com
 */

public class HeapSort {

    /* Note
     *  In heap sort first, we need to create either min/max heap.
     *  Ascending: Min Heap
     *  Descending: Max Heap
     * */

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 6, 10, 9, 2);

        System.out.println(list);

        // Create min heap
        MinHeap minHeap = new MinHeap();

        // This will take O(n)
        minHeap.heapify(list);

        minHeap.display();

        // Remove every element
        // It will give you the sorted result
        System.out.println(minHeap.deleteFirst());
        System.out.println(minHeap.deleteFirst());
        System.out.println(minHeap.deleteFirst());
        System.out.println(minHeap.deleteFirst());
        System.out.println(minHeap.deleteFirst());

    }

}
