package Tries_and_Huffmans_coding;

import java.util.ArrayList;

public class PatternMatching {

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

        public boolean search(String word) {
            return search(root, word);
        }

        private boolean search(TrieNode root, String word) {
            if (word.length() == 0) {
                return true;
            }
            int childIndex = word.charAt(0) - 'a';
            TrieNode child = root.children[childIndex];
            if (child == null) {
                return false;
            }
            return search(child, word.substring(1));
        }

        public boolean patternMatching(ArrayList<String> vect, String pattern) {
            // Write your code here
            if (vect == null || pattern == null) {
                return false;
            }
            for (String word : vect) {
                if (word.length() < pattern.length()) {
                    continue;
                }

                for (int i = 0; i <= word.length() - pattern.length(); i++) {
                    boolean match = true;

                    for (int j = 0; j < pattern.length(); j++) {
                        char wordChar = word.charAt(i + j);
                        char patternChar = pattern.charAt(j);

                        if (patternChar != '.' && patternChar != wordChar) {
                            match = false;
                            break;
                        }
                    }

                    if (match) {
                        return true;
                    }
                }
            }

            return false;

        }
    }

}
