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
    public boolean find(TreeNode root, int x, StringBuilder sb){
        if(root.val==x)
            return true;
        if(root.left!=null && find(root.left,x,sb))
            sb.append("L");
        else if(root.right!=null && find(root.right,x,sb))
            sb.append("R");
        if(sb.length()>0)
            return true;
        else
            return false;
    }
    
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s=new StringBuilder(), d=new StringBuilder();
        find(root,startValue,s);
        find(root,destValue,d);
        int i=0; 
        int max_i=Math.min(d.length(),s.length());
        while(i<max_i && s.charAt(s.length()-i-1)==d.charAt(d.length()-i-1))
            i++;
        return "U".repeat(s.length()-i)+d.reverse().toString().substring(i);
    }
}