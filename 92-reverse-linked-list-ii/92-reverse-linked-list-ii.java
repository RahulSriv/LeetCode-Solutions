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
        Deque<Integer> dq=new ArrayDeque<Integer>();
        ListNode t=head;
        int ct=0;
        while(t!=null && ct<=right){
            ct++;
            if(ct>=left && ct<=right){
                dq.add(t.val);
            }   
            t=t.next;
        }
        int k=dq.size();
        t=head;
        ct=0;
        while(t!=null && ct<=right){
            ct++;
            if(ct>=left && ct<=right){
                t.val=dq.removeLast();
            }   
            t=t.next;
        }
        return head;
    }
}