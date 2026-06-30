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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int length = 0;
        ListNode temp = head;

        while(temp != null){
            length++;
            temp = temp.next;
        }
           k = k%length;
        ListNode curr = head;
        ListNode prev = null;
        for(int i=k;i>0;i--){
        while(curr!=null && curr.next!=null){
            prev = curr;
            curr = curr.next; 
        }
        curr.next = head;
        prev.next = null;
        head = curr;
        curr = head;
        prev = null;
        
      }
      
      return head;
    }
}