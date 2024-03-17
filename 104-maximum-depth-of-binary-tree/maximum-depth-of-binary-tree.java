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
    public int maxDepth(TreeNode root) {
        TreeNode u=root;
        Stack<TreeNode> stack= new Stack<>();
        Stack<Integer> visited = new Stack<>();
        if(root==null)
            return 0;
        stack.add(u);
        visited.push(1);
        int max=0;
        while(!stack.isEmpty()){
            TreeNode v=stack.pop();
            int temp=visited.pop();
            max= Math.max(temp,max);
            if(v.left!=null){
                stack.push(v.left);
                visited.push(temp+1);
            }
            if(v.right!=null){
                stack.push(v.right);
                visited.push(temp+1);
            }
        }
        return max;
    }
}