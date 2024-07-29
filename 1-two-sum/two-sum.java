class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> list= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            list.put(nums[i],i);
        }
        int[] result=new int[2];
        System.out.println(list);
        for(int i=0;i<nums.length;i++){
            int x=list.getOrDefault(target-nums[i],-1);
            if(x!=-1&&x!=i){
                result[0]=i;
                result[1]=x;
                break;
            }
                
        }
        return result;
    }
}