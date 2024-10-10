package LinkedList;

public class Swapping_nodes_inLL {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode p = fast;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode q = slow;
        
        int t = p.val;
        p.val = q.val;
        q.val = t;
        return head;
    }
}
