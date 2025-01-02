package stack;

import java.util.Stack;

public class remove_adjacent_ele_string {
    class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i <= s.length() - 1; i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        
        char[] arr = new char[st.size()];
        for(int i = arr.length-1; i >= 0; i--){
            arr[i] = st.pop();
        }
        return new String(arr);
    }
}
}
