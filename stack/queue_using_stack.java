package stack;

import java.util.Stack;

public class queue_using_stack {
    class MyQueue {

        Stack<Integer> st1;
        Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {

        while(st1.size() > 1){
            st2.push(st1.pop());
        }

        int x = st1.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return x;
    }
    
    public int peek() {

        while(st1.size() > 1){
            st2.push(st1.pop());
        }
        
        int x = st1.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        
        if(st1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
}
