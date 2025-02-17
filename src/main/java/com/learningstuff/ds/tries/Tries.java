package com.learningstuff.ds.tries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 2/16/25
 * Email: mdshamim723@gmail.com
 */

public class Tries {

    private final Node root;

    public Tries() {
        root = new Node('\0', false);
    }

    public void insert(String word) {

        Node current = root;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            int index = c - 'a';

            if (!isExist(index, current)) {
                current.getChildren()[index] = new Node(c, (i == (word.length() - 1)));
            }

            current = current.getChildren()[index];

        }

    }

    public boolean isExist(int charIndex, Node node) {
        return node != null && node.getChildren()[charIndex] != null;
    }

    public boolean search(String word) {


        Node current = root;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            int index = c - 'a';

            if (current.getChildren()[index] == null) {
                return false;
            }

            current = current.getChildren()[index];

        }

        return current.isEndOfChar();
    }

    public boolean startsWith(String prefix) {

        Node current = root;

        for (int i = 0; i < prefix.length(); i++) {

            char c = prefix.charAt(i);
            int index = c - 'a';

            if (current.getChildren()[index] == null) {
                return false;
            }

            current = current.getChildren()[index];
        }

        return true;
    }

    public List<String> findAllStartsWith(String prefix) {

        Node current = root;

        for (int i = 0; i < prefix.length(); i++) {

            char c = prefix.charAt(i);
            int index = c - 'a';

            if (current.getChildren()[index] == null) {
                return new ArrayList<>();
            }

            current = current.getChildren()[index];
        }

        return findAllWordsReturn(current, prefix);
    }

    public void allWords() {

        findAllWords(this.root, "");

    }

    private void findAllWords(Node node, String prefix) {

        if (node.getChildren() == null || node.getChildren().length < 1) {
            return;
        }

        if (node.isEndOfChar()) {
            System.out.println(prefix);
        }

        for (Node child : node.getChildren()) {
            if (child == null) {
                continue;
            }
            findAllWords(child, prefix + child.getValue());
        }

    }

    private List<String> findAllWordsReturn(Node node, String prefix) {

        List<String> words = new ArrayList<>();

        if (node.getChildren() == null || node.getChildren().length < 1) {
            return words;
        }

        if (node.isEndOfChar()) {
            words.add(prefix);
        }

        for (Node child : node.getChildren()) {

            if (child == null) {
                continue;
            }

            List<String> list = findAllWordsReturn(child, prefix + child.getValue());
            words.addAll(list);

        }

        return words;
    }

    public static void main(String[] args) {

        Tries tries = new Tries();
        tries.insert("abc");
        tries.insert("def");
        tries.insert("ghi");
        tries.insert("adef");

        System.out.println(tries.search("ghi"));
        System.out.println(tries.search("adef"));
        System.out.println(tries.search("adefd"));

        System.out.println(tries.startsWith("a"));
        System.out.println(tries.startsWith("x"));

        System.out.println();
        System.out.println(tries.findAllStartsWith("a"));

        System.out.println();
        tries.allWords();


    }

}
