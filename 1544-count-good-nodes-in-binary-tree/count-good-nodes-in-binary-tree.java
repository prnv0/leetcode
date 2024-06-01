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
int c=0;
    public void good(TreeNode root,int max){
        if(root!=null){
            if(root.val>=max)
                c++;
            
            good(root.left,Math.max(root.val,max));
            good(root.right,Math.max(root.val,max));
        }

    }
    public int goodNodes(TreeNode root) {
        good(root,root.val);
        return c;
        
    }
}