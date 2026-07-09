class WordDictionary {

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

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.isWord = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int pos, TrieNode node) {
        if (node == null) {
            return false;
        }

        if (pos == word.length()) {
            return node.isWord;
        }

        char ch = word.charAt(pos);

        if (ch == '.') {
            for (int i = 0; i < 26; i++) {
                if (dfs(word, pos + 1, node.children[i])) {
                    return true;
                }
            }
            return false;
        }

        return dfs(word, pos + 1, node.children[ch - 'a']);
    }
}