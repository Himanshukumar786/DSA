package stack;

import java.util.LinkedList;
import java.util.Queue;

public class stack_using_queue {
        class MyStack {
        Queue<Integer> q1; 
        Queue<Integer> q2;
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }
        
        public void push(int x) {
            while(!q1.isEmpty()){
                q2.offer(q1.poll());
            }
            q1.offer(x);
            while(!q2.isEmpty()){
                q1.offer(q2.poll());
            }
        }
        
        public int pop() {
            return q1.poll();
        }
        
        public int top() {
            return q1.peek();
        }
        
        public boolean empty() {
            if(q1.isEmpty()) return true;
            else return false;
        }
    }
    
}
