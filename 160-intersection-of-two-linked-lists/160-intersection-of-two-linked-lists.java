/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp1=headA, tmp2=headB;
        boolean f1=false, f2=false;
        while(tmp1!=null && tmp2!=null){
            if(tmp1==tmp2)
                return tmp1;
            tmp1=tmp1.next;
            tmp2=tmp2.next;
            if(tmp1==null && !f1){
                tmp1=headB;
                f1=true;
            }
            if(tmp2==null && !f2){
                tmp2=headA;
                f2=true;
            }
        }
        return null;
    }
}

// NON OPTIMAL 
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         while(headA!=null){
//             ListNode tmp=headB;
//             while(tmp!=null){
//                 if(headA==tmp)
//                     return tmp;
//                 tmp=tmp.next;
//             }
//             headA=headA.next;
//         }
//         return null;
//     }
// }