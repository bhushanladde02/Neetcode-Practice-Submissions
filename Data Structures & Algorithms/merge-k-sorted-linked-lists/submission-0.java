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
        Queue<ListNode> queue = new PriorityQueue<ListNode>((a,b)->a.val-b.val);
        ListNode dummy = new ListNode();
        ListNode parent = dummy;
        for(ListNode l : lists){
            queue.offer(l);
        }

        while(!queue.isEmpty()){
            ListNode pop = queue.poll();
            if(pop!=null){
                if(pop.next!=null)
                    queue.offer(pop.next);
                pop.next = null;
                dummy.next = pop;
                dummy = dummy.next;
            }
        }

        return parent.next;

    }
}
