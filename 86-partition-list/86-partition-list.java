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
    public ListNode partition(ListNode head, int x) {
        ListNode first=new ListNode(0);
        ListNode second=new ListNode(0);
        ListNode ft=first;
        ListNode st=second;
        while(head!=null){
            if(head.val>=x){
                second.next=head;
                second=second.next;
            }
            else{
                first.next=head;
                first=first.next;
            }
            head=head.next;
        }
        second.next=null;
        first.next=st.next;
        return ft.next;
    }
}