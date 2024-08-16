package LinkedList;

public class remove_ll_element {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            
            ListNode node = new ListNode(-1);
            node.next = head;
            
            ListNode prev = node;
            ListNode curr = head;
            
            while(curr != null){
                if(curr.val == val){
                    prev.next = curr.next;
                    // prev = curr;
                } else {
                   prev = curr; 
                }
                curr = curr.next;
            }
            return node.next;
        }
    }
}
