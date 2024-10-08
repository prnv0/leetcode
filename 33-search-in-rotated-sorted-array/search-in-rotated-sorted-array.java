class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[start]<=nums[mid]){
                if(nums[start] <= target && nums[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else{
                if( target <= nums[end] && nums[mid]<target)
                    start=mid+1;
                else 
                    end=mid-1;
            }
        }
        return -1;
    }
}