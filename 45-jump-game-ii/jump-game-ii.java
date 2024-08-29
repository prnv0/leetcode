class Solution {
    public int jump(int[] nums) {
        int max=0,curmax=0,count=0,i=0;
        while(i<nums.length-1){
            max=Math.max(max,nums[i]+i);
            if(i==curmax){
                count++;
                curmax=max;
            }
            i++;
        }
        return count;
    }
}