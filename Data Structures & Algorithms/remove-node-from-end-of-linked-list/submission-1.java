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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode current = head;
        ListNode prev = head;
        while(n>0 && current != null){
            current = current.next;
            n--;
        }

        if(current == null)
            return prev.next;

        while(current!=null){
            prev = start; 
            start = start.next;
            current = current.next;
        }

        prev.next = start.next;
        return head;
    }
}
