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
    Queue<TreeNode> q=new LinkedList<>();   
    public void flatten(TreeNode root) {
        preorder(root);
        if(root==null || q.size()==1)   
            return;
        if(!q.isEmpty()){
            root=q.poll();
            root.left=null;
            TreeNode tmp=root;
            while(!q.isEmpty()){
                TreeNode node=q.poll();
                node.left=null;
                tmp.right=node;
                tmp=tmp.right;
            }
        }
    }
    public void preorder(TreeNode root){
        if(root!=null){
            q.offer(root);
            preorder(root.left);
            preorder(root.right);   
        }
    }
}