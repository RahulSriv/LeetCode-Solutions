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
    public TreeNode arrayToTree(int[] preorder, int left, int right){
        if(left>right)
            return null;
        int r=preorder[idx];
        idx++;
        TreeNode root=new TreeNode(r);
        root.left=arrayToTree(preorder,left,m.get(r)-1);
        root.right=arrayToTree(preorder,m.get(r)+1,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx=0;
        for(int i=0;i<inorder.length;i++)
            m.put(inorder[i],i);
        TreeNode t=arrayToTree(preorder,0,preorder.length-1);
        return t;
    }
}