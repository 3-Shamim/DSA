package com.learningstuff.huffman_coding;

import com.learningstuff.ds.priority_queue.PriorityQueue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/14/25
 * Email: mdshamim723@gmail.com
 */

public class HuffmanCoding {

    public static void main(String[] args) {

        String text = "aabbcbaded";

        // Calculate character frequency
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {

            freq.put(
                    text.charAt(i),
                    freq.getOrDefault(text.charAt(i), 0) + 1
            );

        }

        // Create priority query. Priority is min frequency node will be the always in the first place
        // Using min heap
        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            queue.insert(node);
        }

        // Generate the tree

        while (queue.getSize() > 1) {
            Node f = queue.remove();
            Node s = queue.remove();
            Node node = new Node('-', f.getFrequency() + s.getFrequency(), f, s);
            queue.insert(node);
        }

        Node root = queue.remove();




    }

}
