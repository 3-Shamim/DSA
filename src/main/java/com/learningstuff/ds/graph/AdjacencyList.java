package com.learningstuff.ds.graph;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 2/8/25
 * Email: mdshamim723@gmail.com
 */

public class AdjacencyList {

    Map<Long, List<Long>> adjacencyList;

    public AdjacencyList() {
        this.adjacencyList = new HashMap<>();
    }

    void addVertex(long vertex) {
        this.adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(long v, long e) {
        if (this.adjacencyList.containsKey(v)) {
            this.adjacencyList.get(v).add(e);
        }
    }

    private void display() {
        System.out.println(adjacencyList);
    }

    public static void main(String[] args) {

        AdjacencyList list = new AdjacencyList();

        for (int i = 0; i <= 5; i++) {
            list.addVertex(i);
        }

        list.addEdge(0, 1);
        list.addEdge(0, 2);
        list.addEdge(1, 3);
        list.addEdge(1, 4);
        list.addEdge(2, 3);
        list.addEdge(3, 1);
        list.addEdge(3, 4);
        list.addEdge(4, 0);

        list.display();

        Set<Long> seen = new HashSet<>();

        // Starting from 0
        recursiveDFS(list.adjacencyList, 0, seen);

        System.out.println();

        // Visit through all vertices
        // This will cover unconnected graph
        seen.clear();
        for (Long vertex : list.adjacencyList.keySet()) {
            recursiveDFS(list.adjacencyList, vertex, seen);
        }
        System.out.println();

        stackUsedForDFS(list.adjacencyList);
        System.out.println();

        queueUsedForBFS(list.adjacencyList);
        System.out.println();

    }

    private static void queueUsedForBFS(Map<Long, List<Long>> adjacencyList) {

        Set<Long> seen = new HashSet<>();

        Queue<Long> queue = new LinkedList<>();

        // Starting from 0
        queue.add(0L);

        while (!queue.isEmpty()) {

            long vertex = queue.remove();

            if (!seen.contains(vertex)) {
                seen.add(vertex);
                System.out.printf("%d ", vertex);
            }

            List<Long> edges = adjacencyList.get(vertex);

            if (edges != null) {
                for (long edge : edges) {

                    if (!seen.contains(edge)) {
                        queue.add(edge);
                    }

                }
            }

        }

    }


    private static void stackUsedForDFS(Map<Long, List<Long>> adjacencyList) {

        Set<Long> seen = new HashSet<>();

        Stack<Long> stack = new Stack<>();
        // Starting from 0
        stack.push(0L);

        while (!stack.isEmpty()) {

            long vertex = stack.pop();

            if (!seen.contains(vertex)) {
                seen.add(vertex);
                System.out.printf("%d ", vertex);
            }

            List<Long> edges = adjacencyList.get(vertex);

            if (edges != null) {

                for (long edge : edges) {

                    if (!seen.contains(edge)) {
                        stack.push(edge);
                    }

                }

            }

        }


    }

    private static void recursiveDFS(Map<Long, List<Long>> adjacencyList, long current, Set<Long> seen) {

        if (!seen.contains(current)) {
            seen.add(current);
            System.out.print(current + " ");
        }

        List<Long> edges = adjacencyList.get(current);

        if (edges == null || edges.isEmpty()) {
            return;
        }

        for (long edge : edges) {
            if (!seen.contains(edge)) {
                recursiveDFS(adjacencyList, edge, seen);
            }
        }

    }

}
