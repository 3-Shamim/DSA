package com.learningstuff.huffman_coding;

import com.learningstuff.ds.priority_queue.PriorityQueue;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/14/25
 * Email: mdshamim723@gmail.com
 */

public class HuffmanCoding {

    private static Map<Character, String> encoderMap = new HashMap<>();
    private static Map<String, Character> decoderMap = new HashMap<>();

    public static void main(String[] args) {

        String text = "aabbcbaded";

        System.out.println("Original text: " + text);

        Map<Character, Integer> freq = getCharacterFrequency(text);

        Node root = generateTree(freq);

        generateEncoderDecoderTable(root, "");

        String encode = encodeAsString(text);
        System.out.println("Encoded text: " + encode);
        String decode = decodeAsString(encode);
        System.out.println("Decoded text: " + decode);

        BitSet encodedBit = encode(text);
        System.out.println("Encoded Bit: " + encodedBit);
        String decodeFromBit = decode(encodedBit);
        System.out.println("Decoded Bit: " + decodeFromBit);

    }

    private static String decodeAsString(String encode) {

        StringBuilder decode = new StringBuilder();

        StringBuilder bitSeq = new StringBuilder();

        for (int i = 0; i < encode.length(); i++) {

            char ch = encode.charAt(i);
            bitSeq.append(ch);

            Character character = decoderMap.get(bitSeq.toString());

            if (character != null) {
                bitSeq = new StringBuilder();
                decode.append(character);
            }

        }

        return decode.toString();
    }

    private static String decode(BitSet bitSet) {

        StringBuilder decode = new StringBuilder();

        StringBuilder bitSeq = new StringBuilder();

        for (int i = 0; i < bitSet.length() - 1; i++) {

            char ch = bitSet.get(i) ? '1' : '0';
            bitSeq.append(ch);

            Character character = decoderMap.get(bitSeq.toString());

            if (character != null) {
                bitSeq = new StringBuilder();
                decode.append(character);
            }
        }

        return decode.toString();
    }

    private static String encodeAsString(String text) {

        StringBuilder encode = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            encode.append(encoderMap.get(ch));
        }

        return encode.toString();
    }

    private static BitSet encode(String text) {

        BitSet bitSet = new BitSet();

        int bitIndex = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String bitByCh = encoderMap.get(ch);

            for (int j = 0; j < bitByCh.length(); j++) {
                bitSet.set(bitIndex, bitByCh.charAt(j) == '1');
                bitIndex++;
            }

        }

        bitSet.set(bitIndex, true);

        return bitSet;
    }

    private static Node generateTree(Map<Character, Integer> freq) {

        // Create priority query. Priority is min frequency node will be always in the first place
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

        return queue.remove();
    }

    private static Map<Character, Integer> getCharacterFrequency(String text) {

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            freq.put(
                    text.charAt(i),
                    freq.getOrDefault(text.charAt(i), 0) + 1
            );
        }

        return freq;
    }

    private static void generateEncoderDecoderTable(Node root, String bitSeq) {

        if (root == null) {
            return;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            encoderMap.put(root.getSymbol(), bitSeq);
            decoderMap.put(bitSeq, root.getSymbol());
        }

        generateEncoderDecoderTable(
                root.getLeft(), root.getLeft() == null ? bitSeq : bitSeq + "0"
        );
        generateEncoderDecoderTable(
                root.getRight(), root.getRight() == null ? bitSeq : bitSeq + "1"
        );

    }

}
