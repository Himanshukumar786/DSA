package Trie;

class Trie {

    static class Node{
        Node[] children;
        boolean isTerminal;

        public Node(){
            children = new Node[26]; // a -> z
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            isTerminal = false;
        }

    }
    // root node which is empty
    static Node root = new Node();

    public static void insert(String word){ // O(L)
        Node curr = root; // start from root
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                // adding new node
                curr.children[idx] = new Node();
            }

            if(i == word.length() - 1){
                curr.children[idx].isTerminal = true; // mark last node as terminal
            }

            curr = curr.children[idx]; // move to the next node
        }
    }

    public static boolean search(String key){ // O(L)
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && node.isTerminal == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};

        for(int i=0; i < words.length; i++) insert(words[i]);

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("a"));
    }
}
