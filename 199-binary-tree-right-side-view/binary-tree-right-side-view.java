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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int qlen,i;
        while(!q.isEmpty()){
            TreeNode rightSide=null;
            qlen=q.size();
            for(i=0;i<qlen;i++){
                TreeNode node=q.remove();
                if(node!=null){
                    rightSide=node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(rightSide!=null)
                l.add(rightSide.val);
        }
        return l;

    }
}