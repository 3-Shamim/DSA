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

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {

            freq.put(
                    text.charAt(i),
                    freq.getOrDefault(text.charAt(i), 0) + 1
            );

        }

        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            queue.insert(node);
        }

        Node node = queue.remove();

        while (node != null) {
            System.out.println(node);
            node = queue.remove();
        }

    }

}
