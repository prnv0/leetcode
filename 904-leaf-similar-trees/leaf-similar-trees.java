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
    String stack="";
    public void leafcheck(TreeNode root){
        if(root == null)
            return;
        
        leafcheck(root.left);
        leafcheck(root.right);
         if(root.left==null&&root.right==null)
            stack=stack+" "+root.val;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leafcheck(root1);
        String stack1=stack;
        stack="";
        leafcheck(root2);
        String stack2=stack;
        System.out.println(stack1+" "+stack2);
        if(stack1.compareTo(stack2)==0)
            return true;
        return false;
    }
}