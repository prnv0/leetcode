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
    public TreeNode replaceValueInTree(TreeNode root) {
         ArrayList<Integer> arr= new ArrayList<>();
         Queue<TreeNode> q= new LinkedList<>();
         q.add(root);
         int height=0;
         while(!q.isEmpty()){
            int len=q.size();
            int sum=0;
            for(int i=0;i<len;i++){
                TreeNode temp=q.remove();
                sum+=temp.val;
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            arr.add(sum);
         }
        arr.add(0);
        q.add(root);
        root.val=0;
        height=1;

        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
            int sum=arr.get(height);
            TreeNode temp=q.remove();
            if(temp.left!=null)
                sum=sum-temp.left.val;
            if(temp.right!=null){
                //System.out.println(sum+" - "+ temp.right.val);
                sum=sum-temp.right.val;
                
            }
            
            if(temp.left!=null){
                temp.left.val=sum;
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.val=sum;
                q.add(temp.right);
            }
            }
            height++;

         }
        return root;
    }
}