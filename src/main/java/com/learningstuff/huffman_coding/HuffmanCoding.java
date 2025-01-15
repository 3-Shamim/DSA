package com.learningstuff.huffman_coding;

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



    }

}
