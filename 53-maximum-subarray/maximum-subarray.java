class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,maxsofar=0,start,end;
        for(int i=0;i<nums.length;i++){
            if(maxsofar==0)
                start=i;
            maxsofar+=nums[i];
            if(maxsofar>max){
                max=maxsofar;
                end=i;
            }
            if(maxsofar<0){
               maxsofar=0; 
            }
            
        }
        return max;

    }
}