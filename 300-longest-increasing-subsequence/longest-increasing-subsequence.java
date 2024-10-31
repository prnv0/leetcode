class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int max=1;
        int[] LIS= new int[n];
        LIS[n-1]=1;
        Arrays.fill(LIS, 1);
        for(int i=n-2;i>=0;i--){
            for(int j=i;j<n;j++){
                if(nums[j]>nums[i])
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
            }
            max = Math.max(max,LIS[i]);
        }
        return max;
    }
}