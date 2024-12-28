package stack;

import java.util.Stack;

public class mini_add_parathesvalid {
    
    // we can optimize this, that means without using space(stack)
    
    class Solution {
        public int minAddToMakeValid(String s) {
            
            Stack<Character> st = new Stack<>();
            
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    st.push(s.charAt(i));
                } else {
                    if(st.isEmpty() || st.peek() == ')' ){
                        st.push(s.charAt(i));
                    } else {
                        st.pop();
                    }
                }
            }
            return st.size();
        }
    }
}
