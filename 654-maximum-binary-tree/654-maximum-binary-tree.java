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
    public int getMax(int[] nums, int l, int r){
        int res=l;
        for(int i=l+1;i<=r;i++)
            if(nums[i]>nums[res])
                res=i;
        return res;
    }
    public TreeNode construct(int[] nums, int l, int r){
        if(l>r)
            return null;
        int max=getMax(nums,l,r);
        TreeNode root=new TreeNode(nums[max]);
        root.left=construct(nums,l,max-1);
        root.right=construct(nums,max+1,r);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
}