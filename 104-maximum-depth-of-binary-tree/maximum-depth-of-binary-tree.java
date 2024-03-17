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
        Queue<TreeNode> queue= new LinkedList<>();
        Queue<Integer> visited = new LinkedList<>();
        if(root==null)
            return 0;
        queue.add(u);
        visited.add(1);
        int max=0;
        while(!queue.isEmpty()){
            TreeNode v=queue.remove();
            int temp=visited.remove();
            max= Math.max(temp,max);
            if(v.left!=null){
                queue.add(v.left);
                visited.add(temp+1);
            }
            if(v.right!=null){
                queue.add(v.right);
                visited.add(temp+1);
            }
        }
        return max;
    }
}