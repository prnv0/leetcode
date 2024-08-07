class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
            int i=0;
            while(i<nums.length){
                if(i>0&&nums[i]==nums[i-1]){
                    i++;
                    continue;
                }
                int j=i+1;
                int  k=nums.length-1;
                while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> temp= new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        list.add(temp);
                        j++;
                        while(nums[j]==nums[j-1]&&j<k)j++;
                    }
                    else if(sum<0)j++;
                    else k--;
                    //while(nums[j])
                }
                i++;
            }
        return list;
    }
}