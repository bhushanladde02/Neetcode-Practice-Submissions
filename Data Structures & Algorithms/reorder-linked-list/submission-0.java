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
    public void reorderList(ListNode head) {
      //  ListNode dummy = null;
        ListNode current = head;
        ListNode slow = head;
        ListNode prevSlow = null;
        ListNode fast = head;

        while(slow!=null && fast!=null && fast.next!=null){
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prevSlow!=null)
            prevSlow.next = null;

        ListNode reverseNodeList = reverseList(slow);
        ListNode last = null;
        //System.out.println(prevSlow.val);
        while(current!=null && reverseNodeList!=null){
            ListNode temp = reverseNodeList.next;
            ListNode temp2 = current.next;
            current.next = reverseNodeList;
            reverseNodeList.next = temp2;
            last = reverseNodeList;
            reverseNodeList = temp;
            current = temp2;

        }
      
        if(reverseNodeList!=null && last!=null){
            last.next = reverseNodeList;
        }
    }

    public ListNode reverseList(ListNode node){
        ListNode current = node;
        ListNode prev = null;
        
        while(current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        //System.out.println(prev.next.val);
        return prev;
    }
}
