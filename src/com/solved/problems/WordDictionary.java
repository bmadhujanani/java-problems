package com.solved.problems;

public class WordDictionary {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.isWord = true;
    }

    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }

    private boolean searchHelper(String word, int pos, TrieNode node) {
        if (node == null) {
            return false;
        }

        if (pos == word.length()) {
            return node.isWord;
        }

        char ch = word.charAt(pos);

        if (ch == '.') {
            for (int i = 0; i < 26; i++) {
                if (searchHelper(word, pos + 1, node.children[i])) {
                    return true;
                }
            }
            return false;
        } else {
            return searchHelper(word, pos + 1,
                    node.children[ch - 'a']);
        }
    }

    public static void main(String[] args) {

        WordDictionary dict = new WordDictionary();

        dict.addWord("bad");
        dict.addWord("dad");
        dict.addWord("mad");

        System.out.println(dict.search("pad")); // false
        System.out.println(dict.search("bad")); // true
        System.out.println(dict.search(".ad")); // true
        System.out.println(dict.search("b..")); // true
    }
}
