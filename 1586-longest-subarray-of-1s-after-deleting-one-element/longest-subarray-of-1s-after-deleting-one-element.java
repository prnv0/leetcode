class Solution {
    public int longestSubarray(int[] nums) {
        int i,k=1,j=0,count=0,maxcount=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)
                k--;
            while(k<0){
                if(nums[j]==0)
                    k++;
                j++;
            }
            if(maxcount<i-j)
                maxcount=i-j;
        }
        return maxcount;
            
    }
}