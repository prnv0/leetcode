class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,sum;
        double avg=0;
        for(i=0;i<k;i++)
            avg=avg+(double)nums[i]/k;
        double maxavg=avg;
        for(i=k;i<nums.length;i++){
            avg=avg+(double)nums[i]/k-(double)nums[i-k]/k;
            if(maxavg<=avg)
                maxavg=avg;

        }
        return maxavg;
    }
}