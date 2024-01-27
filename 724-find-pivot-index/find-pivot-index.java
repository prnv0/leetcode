class Solution {
    public int pivotIndex(int[] nums) {
        int sum[]=new int[nums.length+1],k=0;
        sum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        if(sum[nums.length-1]-sum[0]==0)
            return 0;
        // else if(sum[nums.length-1]==0)
        //     return nums.length;
        for(int i=1;i<nums.length;i++){
            
            if(sum[i-1]==(sum[nums.length-1]-sum[i])){
                k++;
                return i;

            }
                
        }
        return -1;
    }
}