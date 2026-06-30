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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        if(left==right){
            return head;
        }
        ListNode before = null;
        ListNode t = head;
        int pos = 1;
        int times = right-left+1;
        while(pos<left){
            before = t;
            t = t.next;
            pos++;
        }
        ListNode curr = t;
        ListNode prev = null;
        while(times>0){
            ListNode nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
            times--;
        }
        t.next = curr;
        if(before!=null){
        before.next = prev;
        return head;
        }

        return prev;
    }
}