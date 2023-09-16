class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE, secondmin=Integer.MAX_VALUE;
        int num=0;
        int n;
        while(num<nums.length){
            n=nums[num];
            if(n<=min)
                min=n;
            else if(n<secondmin)
                secondmin=n;
            else if(n>secondmin)
                return true;
            num++;
        }
        return false;
        
    }
}