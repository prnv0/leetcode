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
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int temp = -1;
            int size=q.size();
            for(int i=0;i<size;i++){
                if(q.peek()!=null){
                    q.add(q.peek().left);
                    q.add(q.peek().right);
                    temp=q.peek().val;
                }
                q.remove();
            }
            if(temp!=-1)
                list.add(temp);
        }
        return list;
    }
}