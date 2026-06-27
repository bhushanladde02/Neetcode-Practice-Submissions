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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int c = 0 ;

        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + c;

            if(sum>9){
                int r = sum%10;
                 c = sum/10;
                dummy.next = new ListNode(r);
            }else{
                dummy.next = new ListNode(sum);
                c =0;
            }
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1!=null){
            int sum = l1.val  + c;

            if(sum>9){
                int r = sum%10;
                 c = sum/10;
                dummy.next = new ListNode(r);
            }else{
                dummy.next = new ListNode(sum);
                 c =0;
            }
            dummy = dummy.next;
            l1 = l1.next;
           
        }
         while(l2!=null){
            int sum = l2.val + c;
            if(sum>9){
                int r = sum%10;
                 c = sum/10;
                dummy.next = new ListNode(r);
            }else{
                dummy.next = new ListNode(sum);
            }
            dummy = dummy.next;
            l2 = l2.next;
        }

        if(c>0){
            int sum = c;
            if(sum>9){
                int r = sum%10;
                 c = sum/10;
                dummy.next = new ListNode(r);
                dummy.next = new ListNode(c);
            }else{
                dummy.next = new ListNode(sum);
            }
            dummy.next = new ListNode(c);
        }

        return head.next;
    }
}
