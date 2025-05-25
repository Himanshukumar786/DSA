package LinkedList;

public class Reverse_LL {
    public ListNode reverseList(ListNode head) {
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
}

// Definition for singly-linked list node.
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
