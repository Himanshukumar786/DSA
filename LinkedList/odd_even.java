package LinkedList;

public class odd_even {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head == null || head.next == null) return head;
            
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = head.next;
            
            // in this question while continue is imp bcs odd even kidhar rokna hai yeh figure out krna hoga
            // and odd condition phle check hogi even after
            while(odd.next != null && even.next != null){
                odd.next = even.next;
                odd = odd.next;
                
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
    }
}
