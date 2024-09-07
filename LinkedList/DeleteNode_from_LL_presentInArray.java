package LinkedList;

public class DeleteNode_from_LL_presentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        // boolean aaray having false value
        boolean[] set = new boolean[ (int)1e5 + 1]; // convert 1e5 (which is 100,001) to an integer
        
        // fill the set boolean array with (nums -> which will be want to delete) true value
        for(int num : nums) set[num] = true;
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            
            if(set[curr.val] == true){
                
                // delete node at head
                if(prev == null){
                    head = head.next;
                    curr.next = null;
                    curr = head;
                } else {
                    
                    // delete node at any middle (basically skip the delete node)
                    prev.next = curr.next;
                    curr.next = null;
                    curr = prev.next;
                }
                
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
