class Solution {
    public void moveZeroes(int[] nums) {
        int i,temp;
        if(nums.length==1)
            return;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==0&&nums[i+1]!=0){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            else if(nums[i]==0&&nums[i+1]==0){
                int j=i+1;
                while(j<nums.length-1){
                    if(nums[j]!=0)
                        break;
                    j++;
                }
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
                
        }
        return;
    }
}