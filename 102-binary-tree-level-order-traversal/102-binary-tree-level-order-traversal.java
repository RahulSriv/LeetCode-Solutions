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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null)
            return res;
        Queue<TreeNode> q=new ArrayDeque<TreeNode>();
        q.add(root);
        List<Integer> sub=new ArrayList<>();
        Queue<TreeNode> ch=new ArrayDeque<TreeNode>();
        while(q.size()>0){
            TreeNode tmp=q.remove();
            sub.add(tmp.val);
            if(tmp.left!=null)
                ch.add(tmp.left);
            if(tmp.right!=null)
                ch.add(tmp.right);
            if(q.size()==0){
                res.add(new ArrayList<Integer>(sub));
                q=new ArrayDeque<>(ch);
                sub.clear();
                ch.clear();
            }                
        }
        return res;
    }
}