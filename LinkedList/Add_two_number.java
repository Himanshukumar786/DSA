package LinkedList;

public class Add_two_number {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode temp = null;
        
        int carry = 0;
        
        while(l1 != null || l2 != null || carry !=0){

            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;

            int value = val1 + val2 + carry;
            
            ListNode node = new ListNode(value%10);
            carry = value / 10;
            
            if(head == null){
                head = node;
                temp = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return head;
    }
}
