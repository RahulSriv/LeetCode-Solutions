/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode first=null;
    TreeNode second=null; 
    TreeNode prev=null;
    public void inorder(TreeNode root){
        if(root==null)
            return ;
        inorder(root.left);
        if(first==null && (prev==null || prev.val>=root.val))
            first=prev;
        if(first!=null && (prev==null || prev.val>=root.val))
            second=root;
        prev=root;
        inorder(root.right);
        
    }
    public void recoverTree(TreeNode root) {
        if(root==null)
            return ;
        inorder(root);
        int t=first.val;
        first.val=second.val;
        second.val=t;
    }
}
// class Solution {
//     private TreeNode first;
//     private TreeNode second;
//     private TreeNode pre;
//     public void recoverTree(TreeNode root) {
//         if(root==null) return;
//         first = null;
//         second = null;
//         pre = null;
//         inorder(root);
//         int temp = first.val;
//         first.val = second.val;
//         second.val = temp;
//     }
    
//     private void inorder(TreeNode root){
//         if(root==null) return;
//         inorder(root.left);
        
//         if(first==null && (pre==null ||pre.val>=root.val)){
//             first = pre;
//         }
//         if(first!=null && pre.val>=root.val){
//             second = root;
//         }
//         pre = root;
//         inorder(root.right);
//     }
// }