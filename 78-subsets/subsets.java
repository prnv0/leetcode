class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public void backtrack(int[] nums, List<Integer> curr,int i){
        if(i>=nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backtrack(nums,curr,i+1);
        curr.remove(curr.size()-1);
        backtrack(nums,curr,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        backtrack(nums,curr,0);
        return result;
    }
}