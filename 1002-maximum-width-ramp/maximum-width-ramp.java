class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] rMax = new int[n];
        rMax[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rMax[i]=Math.max(rMax[i+1],nums[i]);
        }
        int left=0,right=0;
        int result=0;
        while(right<n){
            while(left<right&&nums[left]>rMax[right]){
                left++;
            }
            result=Math.max(result,right-left);
            right++;
            
        }
        return result;
    }
}