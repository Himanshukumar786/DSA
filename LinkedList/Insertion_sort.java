package LinkedList;

import java.util.List;

public class Insertion_sort {
    public ListNode insertionSortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        ListNode sortedList = head;

        while(temp != null){
            if(temp.val >= sortedList.val){
                sortedList = sortedList.next;
                temp = temp.next;
                continue;
            }
            sortedList.next = temp.next;
            ListNode prev = null;
            ListNode t1 = head;

            while(t1 != sortedList.next){
                if(t1.val >= temp.val){
                    break;
                }
                prev = t1;
                t1 = t1.next;
            }
            if(prev == null){
                temp.next = prev.next;
                prev.next = temp;
            }
            temp = sortedList.next;
        }
        
        return head;
    }
}
