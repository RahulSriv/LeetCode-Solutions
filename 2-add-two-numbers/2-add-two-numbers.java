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
        ListNode res=new ListNode(0);
        ListNode head=res;
        int c=0;
        while(l1!=null || l2!=null || c==1){
            int x = (l1==null?0:l1.val) + (l2==null?0:l2.val) + c;
            if(x>9){
                c=1;
                x%=10;
            }
            else
                c=0;
            res.next=new ListNode(x);
            res=res.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return head.next;
    }
}