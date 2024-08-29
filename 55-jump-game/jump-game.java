class Solution {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        int i=0;
        while(i<=max&&i<nums.length){
            max=Math.max(max,nums[i]+i);
            if(max==nums.length-1)
                return true;
            i++;
        }
        if(max>=nums.length-1)
            return true;
        else return false;
    }
}