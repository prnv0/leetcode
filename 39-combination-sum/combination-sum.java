class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public void dfs(int[] candidates,List<Integer> curr,int i,int sum,int target){
        if(sum>target)
            return;
        else if(sum==target){
            result.add(new ArrayList<>(curr));
            return;
        }
        if (i >= candidates.length) {
            return;
        }
        curr.add(candidates[i]);
        dfs(candidates,curr,i,sum+candidates[i],target);
        curr.remove(curr.size() - 1);
        dfs(candidates,curr,i+1,sum,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,new ArrayList<>(),0,0,target);
        return result;
    }
}