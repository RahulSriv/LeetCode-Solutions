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
        while(tmp1!=tmp2){
            tmp1=(tmp1==null?headB:tmp1.next);
            tmp2=(tmp2==null?headA:tmp2.next);
        }
        return tmp1;
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