package LinkedList;

public class RemoveNth_node_from_endOf_LL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        ListNode fast = head ;
        int i = 0; 
        while(i < n && fast != null){
            i++;
            fast = fast.next;
        }
        
        if(fast == null){
            ListNode newhead = head.next;
            head.next = null;
            return newhead;
        }
        
        ListNode slow = head;
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return head;
    }
}
