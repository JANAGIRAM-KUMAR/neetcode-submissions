class PrefixTree {

    private TrieNode root;

    private class TrieNode {
        TrieNode[] children;
        private boolean isWord;

        public TrieNode(){
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
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
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(current.children[c - 'a'] == null) return false;
            current = current.children[c - 'a'];
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char c: prefix.toCharArray()){
            if(current.children[c - 'a'] == null) return false;
            current = current.children[c - 'a'];
        }
        return true;
    }
}
