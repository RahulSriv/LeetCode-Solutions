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
            if(tmp1==null)
                tmp1=headB;
            else
                tmp1=tmp1.next;
            if(tmp2==null)
                tmp2=headA;
            else
                tmp2=tmp2.next;
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