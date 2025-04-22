package LinkedList;

public class reverse_node_kGroups {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
    
        public int length(ListNode head){
            int counter = 0;
            while(head != null){
                counter++;
                head = head.next;
            }
            return counter;
        }
        public ListNode reverseKGroup(ListNode head, int k) {
            int n = length(head);
            int groups = n/k;
            ListNode prevHead = null;
            ListNode currHead = head;
            ListNode ans = null;
            for(int i = 0; i < groups; i++){
                ListNode prev = null;
                ListNode curr = currHead;
                ListNode nextNode = null;
                // reverse the nodes
                for(int j = 0; j < k; j++){
                    nextNode = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nextNode;
                }
                if(prevHead == null){
                    ans = prev;
                } else {
                    prevHead.next = prev;
                }
                prevHead = currHead;
                currHead = curr;
            }
            // join the last incomplete group
            // if last group was complete currHead would be null
            prevHead.next = currHead;
            return ans;
        }
    }

    @Override
    public String toString() {
        return "reverse_node_kGroups []";
    }
}
