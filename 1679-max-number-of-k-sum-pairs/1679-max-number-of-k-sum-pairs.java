class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1,a,b,count=0;
        while(l<r){
            a=nums[l];
            b=nums[r];
            if(a+b==k){
                count++;
                l++;
                r--;
            }
            else if(a+b>k)
                r--;
            else
                l++;
        }
        return count;
    }
}