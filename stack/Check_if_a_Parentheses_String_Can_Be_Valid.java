package stack;

import java.util.Stack;

public class Check_if_a_Parentheses_String_Can_Be_Valid {
    class Solution {
        public boolean canBeValid(String s, String locked) {
            int n = s.length();

            if(n % 2 != 0) return false;

            Stack<Integer> open = new Stack<>();
            Stack<Integer> openClose = new Stack<>();

            for(int i = 0; i < n; i++){
                if(locked.charAt(i) == '0'){
                    openClose.push(i);
                } else if(s.charAt(i) == '('){
                    open.push(i);
                } else if(s.charAt(i) == ')'){
                    if(!open.isEmpty()){
                        open.pop();
                    } else if(!openClose.isEmpty()){
                        openClose.pop();
                    } else {
                        return false;
                    }
                }
            }

            while(!open.isEmpty() && !openClose.isEmpty() && open.peek() < openClose.peek()){
                open.pop();
                openClose.pop();
            }

            return open.isEmpty();
        }
    }
}
