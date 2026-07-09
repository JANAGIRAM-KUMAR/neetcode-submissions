class WordDictionary {

    private TrieNode root;

    private class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        word = word.toLowerCase();
        TrieNode current = root;
        for(char c : word.toCharArray()){
            int index = c - 'a';
            if(current.children[index] == null){
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            } else {
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        return dfs(word.toLowerCase(),0,root);
    }

    private boolean dfs(String word, int index, TrieNode node) {
        if (node == null) return false;
        if (index == word.length()) return node.isWord;
        char c = word.charAt(index);

        if (c == '.') {
            for (TrieNode child : node.children) {
                if (dfs(word, index + 1, child)) return true;
            }
            return false;
        }

        return dfs(word, index + 1, node.children[c - 'a']);
    }
}
