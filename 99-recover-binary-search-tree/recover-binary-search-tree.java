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
    ArrayList<Integer> arr= new ArrayList<>();
    int index=0;
    public void dfs(TreeNode root){
        if(root==null)
            return;
        arr.add(root.val);
        dfs(root.left);
        dfs(root.right);
        return;
    }
    public void dfscheck(TreeNode root){
        if(root==null)
            return;
        dfscheck(root.left);
        root.val=arr.get(index++);
        dfscheck(root.right);
        return;
    }
    public void recoverTree(TreeNode root) {
        dfs(root);
        Collections.sort(arr);
        dfscheck(root);
        return;
    }
}