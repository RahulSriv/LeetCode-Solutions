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
    List<Integer> al=new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null) 
            return;
        preorder(root);
        TreeNode tmp=root;
        for(int i=1;i<al.size();i++){
            tmp.left=null;
            tmp.right=new TreeNode(al.get(i));
            tmp=tmp.right;
        }
    }
    public void preorder(TreeNode root){
        if(root!=null){
            al.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
}