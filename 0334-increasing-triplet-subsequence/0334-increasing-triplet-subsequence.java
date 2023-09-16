class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE, secondmin=Integer.MAX_VALUE;
        int num=0;
        while(num<nums.length){
            if(nums[num]<=min)
                min=nums[num];
            else if(nums[num]<secondmin)
                secondmin=nums[num];
            else if(nums[num]>secondmin)
                return true;
            num++;
        }
        return false;
        
    }
}