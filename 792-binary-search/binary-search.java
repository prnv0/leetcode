class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int start=0;
        int end=nums.length;
        while(start!=end){
            mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start=mid+1;
            else
                end=mid;
        }
        return -1;
    }
}