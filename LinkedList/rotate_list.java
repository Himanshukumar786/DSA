package LinkedList;

public class rotate_list {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {

            if(k == 0 || head == null || head.next == null){
                return head;
            }
            ListNode last = head;

            // length = 1 ; is also possible
            int length = 0; 
            while(last.next != null){
                length++;
                last = last.next;
            }
            length++;
            
            last.next = head;
            int rotations = k % length;
            int skip = length - rotations;
            
            ListNode newlast = head;
            
            for(int i = 1; i < skip; i++){
                newlast = newlast.next;
            }

            head = newlast.next;
            newlast.next = null;
            
            return head;
        }
    }
}
