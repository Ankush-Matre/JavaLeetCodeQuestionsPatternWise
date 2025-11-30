/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null){
            return false;
        }

        if(head.next == null){
            return false;
        }
        
        ListNode ankush = head;
        ListNode i = head;
       
        while(i != null){
            if(ankush == null){
                return false;
            }
            ankush = ankush.next;
            if(i.next == null){
                return false;
            }
            i = i.next.next;
            if(ankush == i){
                return true;
            }
        }
        return false;
    }
}