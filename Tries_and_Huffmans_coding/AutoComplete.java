package Tries_and_Huffmans_coding;

public class AutoComplete {

import java.util.ArrayList;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {
    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    // Write your code here
    private TrieNode findNodeForPrefix(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            int childIndex = prefix.charAt(i) - 'a';
            if (current.children[childIndex] == null) {
                return null;
            }
            current = current.children[childIndex];
        }
        return current;
    }

    private void findWordsWithPrefix(TrieNode node, String currentPrefix, ArrayList<String> result) {
        if (node.isTerminating) {
            result.add(currentPrefix);
        }
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                findWordsWithPrefix(node.children[i], currentPrefix + node.children[i].data, result);
            }
        }
    }

    public void autoComplete(ArrayList<String> input, String word) {
        boolean found = false;

        for (String w : input) {
            if (w.startsWith(word)) {
                found = true;
                System.out.println(w);
            }
        }

        if (!found) {
            System.out.println();
        }
    }
}}
