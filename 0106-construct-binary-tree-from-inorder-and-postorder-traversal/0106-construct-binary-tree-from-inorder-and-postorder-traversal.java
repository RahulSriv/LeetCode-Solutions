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
    int idx;
    Map<Integer, Integer> m=new HashMap<Integer, Integer>();
    public TreeNode arrayToTree(int[] postorder, int left, int right){
        if(left>right)
            return null;
        int r=postorder[idx];
        idx--;
        TreeNode root=new TreeNode(r);
        root.right=arrayToTree(postorder,m.get(r)+1,right);
        root.left=arrayToTree(postorder,left,m.get(r)-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++)
            m.put(inorder[i],i);
        idx=postorder.length-1;
        TreeNode t=arrayToTree(postorder,0,postorder.length-1);
        return t;
    }
}