package LinkedList;

public class Remove_duplictesFrom_sortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        ListNode temp = head;
        while( temp.next != null ){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
