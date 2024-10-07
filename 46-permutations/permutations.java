class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public void dfs(int[] nums,List<Integer> curr,boolean[] used){
        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        System.out.println(curr);
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                curr.add(nums[i]);
                dfs(nums, curr, used);
                curr.remove(curr.size() - 1); // backtrack
                used[i] = false; // mark the number as unused again
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> curr= new ArrayList<>();
        dfs(nums,curr,used);
        return result;
    }
}