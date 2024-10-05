package LinkedList;

public class Maximum_twin_sum_of_LL {
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        
        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondhalf = slow;
        // slow.next = null;
        ListNode rev = reverse(secondhalf);
        ListNode curr = head;
        ListNode curr2 = rev;
        
        int max = 0;
        while(curr2 != null){
            max = Math.max(max,curr.val + curr2.val);
            curr = curr.next;
            curr2 = curr2.next;
            
        }
        // slow.next = reverse(secondhalf);
        return max;
        
    }
}
