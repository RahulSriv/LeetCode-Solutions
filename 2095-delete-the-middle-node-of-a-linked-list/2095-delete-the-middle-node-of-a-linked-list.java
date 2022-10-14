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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head, slow=head;
        ListNode prev=new ListNode(-1,head);
        while(fast!=null){
            if(fast.next==null)
                break;
            fast=fast.next.next;
            slow=slow.next;
            prev=prev.next;
        }
        prev.next=slow.next; 
        return head;
    }
}