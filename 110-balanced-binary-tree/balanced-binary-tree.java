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
    public int Depth(TreeNode root){
        if(root==null)
            return 0;
        int left=Depth(root.left);
        int right=Depth(root.right);
        if(left==-1||right==-1)
        return -1;
        else if(left-right==-1||left-right==1||left-right==0)
        return Math.max(left,right)+1;
        else
        return -1;
    }
    public boolean isBalanced(TreeNode root) {
        int d=Depth(root);
        if(d==-1)
            return false;
        else 
            return true;
    }
}