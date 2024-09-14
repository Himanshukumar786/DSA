package Trie;

public class Design_Add_And_Word_Ds {
    class WordDictionary {
    
        private class Node{
            
            Node children[];
            boolean isTerminal;
            
            Node(){
                children = new Node[26];
                isTerminal = false;
            }
        }
        
        public Node root;
        
        public WordDictionary() {
            root = new Node();
        }
        
        
        public void addWord(String word) {
            
            Node curr = root;
            for(int i=0; i<word.length(); i++){
                
                char ch = word.charAt(i);
                if(curr.children[ch - 'a'] == null){
                    curr.children[ch - 'a'] = new Node();
                }
                curr = curr.children[ch - 'a'];
            }
            curr.isTerminal = true;
        }
        
        public boolean find(String word, int i, Node node){
            
            if(i == word.length()){
                return node.isTerminal;
            }
            
            char ch = word.charAt(i);
    
            if(word.charAt(i) == '.'){
                
                for(Node child: node.children){
                    if(child != null && find(word, i+1, child)) return true;
                }
                return false;
                
            } else {
                if(node.children[ch - 'a'] == null) return false;
                else return find(word, i + 1, node.children[ch - 'a']);
            }
        }
        
        public boolean search(String word) {
            return find(word, 0, root);
        }
    }
}
