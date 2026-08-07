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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>
        (
            (a,b) -> Integer.compare(a.val , b.val)
        );
        ListNode head = new ListNode();
        ListNode curr = head;
        while(list1!=null){
            pq.add(list1);
            list1 = list1.next;
        }
       while(list2!=null){
            pq.add(list2);
            list2 = list2.next;
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;
            curr.next = pq.peek();
        }
        return head.next;
    }
}