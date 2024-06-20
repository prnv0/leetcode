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
boolean isLeft;
    public void zzhelper(TreeNode root,boolean isLeft,int step){
        if(root==null)return;
        count=Math.max(count,step);
        if(isLeft){
            zzhelper(root.left,false,step+1);
            zzhelper(root.right,true,1);
        }
        else{
            zzhelper(root.right,true,step+1);
            zzhelper(root.left,false,1);
        }

    }
    public int longestZigZag(TreeNode root) {
        zzhelper(root,true,0);
        zzhelper(root,false,0);
        return count;
    }
}