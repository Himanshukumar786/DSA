package stack;

import java.util.Stack;

public class minimium_no_swap {
    //Minimum Number of Swaps to Make the String Balanced -> 1963
    class Solution {
    public int minSwaps(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                st.push(ch);
            } else {
                if(st.isEmpty() || st.peek() == ']'){
                    st.push(ch);
                } else {
                    st.pop();
                }
            }
        }
        
        int totalBracket = st.size();
        int bracket = totalBracket/2;
        return (bracket + 1)/2;
    }
}
}
