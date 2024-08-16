package LinkedList;

public class palindrome {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;
            ListNode nhead = null;
            
            while(fast != null && fast.next != null){
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
                if(nhead == null){
                    nhead = new ListNode(prev.val);
                } else {
                    ListNode node = new ListNode(prev.val);
                    node.next = nhead;
                    nhead = node;
                }
            }
            // if length of ll is odd that means fast reaches at the last node not the null
            if(fast != null){
                slow = slow.next;
            }
            while(slow != null && nhead != null){
                if(slow.val != nhead.val) return false;
                
                nhead = nhead.next;
                slow = slow.next;
            }
            return true;
        }
    }
}
