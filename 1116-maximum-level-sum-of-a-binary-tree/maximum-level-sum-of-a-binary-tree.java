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
    public int maxLevelSum(TreeNode root) {
        
        TreeNode node;
        int i,level=0,max=root.val,sum=root.val,maxlevel=1,qlen;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            qlen=q.size();
            level++;
            sum=0;
            for(i=0;i<qlen;i++){
                node=q.remove();
                if(node!=null){
                    sum+=node.val;
                    if (node.left != null) 
                        q.add(node.left);
                    
                    if (node.right != null) 
                        q.add(node.right);
                }
            
            }
            if(sum>max){
                max=sum;
                maxlevel=level;
            }
        }
        return maxlevel;
    }
}