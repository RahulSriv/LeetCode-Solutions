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
    public List<Integer> res=new ArrayList<Integer>();
    
    public void getView(TreeNode root, int depth){
        if(root==null)
            return ;
        if(res.size()==depth){
            res.add(root.val);
        }
        getView(root.right, depth+1);
        getView(root.left, depth+1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        getView(root, 0);
        return res;
    }
}