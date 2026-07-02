/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;
        ListNode kTH = head;
        ListNode groupNext = null;   
        while(true){
        ListNode temp = groupPrev;

        for(int i=0;i<k;i++){
            temp = temp.next;
            if(temp==null) break;
        }
        if(temp==null) break;
        kTH = temp;
        groupNext = kTH.next;
        kTH.next = null;
        ListNode start = groupPrev.next;
        ListNode curr = start;
        ListNode prev = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        groupPrev.next = prev;
        start.next = groupNext;
        groupPrev = start;     
       }

       return dummy.next;
    }
}