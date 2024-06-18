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
int count=0;
    public void calc(TreeNode root, int targetSum){
        if(root==null)
            return;
        calchelper(root,targetSum);
        calc(root.left,targetSum);
        calc(root.right,targetSum);
    }
    public void calchelper(TreeNode root,long targetSum){
        if(root==null)
            return;
        if(root.val==targetSum)
            count++;
        calchelper(root.left,targetSum-root.val);
        calchelper(root.right,targetSum-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        calc(root,targetSum);
        return count;
    }
}