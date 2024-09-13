package Trie;

public class Prefix_tree {  // trie -> is like n-ary tree 
    class Trie {
        private class Node {
            Node[] children;
            boolean isEnd;
            
            public Node() {
                children = new Node[26]; 
                isEnd = false;        
            }
        }
        
        private Node root;
        
        public Trie() {
            root = new Node(); // root -> empty node
        }
        
        public void insert(String word) { // O(L)
            Node curr = root;  // Start from the root node
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                
                if(curr.children[ch - 'a'] == null) {
                    curr.children[ch - 'a'] = new Node(); 
                }
                curr = curr.children[ch - 'a'];  // Move to the next node
            }
            curr.isEnd = true;  // Mark the end of the word
        }
        
        public boolean search(String word) { // O(L)
            
            Node curr = root;  
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                
                if(curr.children[ch - 'a'] == null) return false; 
                curr = curr.children[ch - 'a'];  
            }
            return curr.isEnd;  
        }
        
        public boolean startsWith(String prefix) {
            
            Node curr = root;  
            for(int i = 0; i < prefix.length(); i++) {
                char ch = prefix.charAt(i);
                
                if(curr.children[ch - 'a'] == null) return false; 
                curr = curr.children[ch - 'a']; 
            }
            return true;  
        }
    }
}
