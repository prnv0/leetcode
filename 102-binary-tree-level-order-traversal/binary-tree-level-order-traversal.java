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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                if(q.peek()!=null){
                    q.add(q.peek().left);
                    q.add(q.peek().right);
                    temp.add(q.peek().val);
                }
                q.remove();
            }
            if(!temp.isEmpty())
                list.add(temp);
        }
        return list;
    }   
}