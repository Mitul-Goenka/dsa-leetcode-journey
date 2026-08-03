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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>
        (
            (a,b) -> Integer.compare(a.val , b.val)
        );
        ListNode head = new ListNode();
        ListNode curr = head;
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;
            if(node.next!=null){
                pq.add(node.next);
            }
        }

        return head.next;
    }
}