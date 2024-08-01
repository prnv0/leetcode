class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0]=nums[0];
        int n=nums.length;
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]*prefix[i-1];
            suffix[n-i-1]=nums[n-i-1]*suffix[n-i];
        }
        nums[0]=suffix[1];
        nums[n-1]=prefix[n-2];
        for(int i=1;i<n-1;i++){
            nums[i]=prefix[i-1]*suffix[i+1];
        }
        return nums;

    }
}