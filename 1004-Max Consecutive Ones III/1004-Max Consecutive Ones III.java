class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0,i,j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)
                k--;
            if(k<0){
                if(nums[j]==0)
                    k++;
                j++; 
            }
        }
        return i-j;

    }
}