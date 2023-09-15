class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre[] = new int[n];
        int post[] = new int[n];
        int ans[]= new int[n];
        int i;
        pre[0]=1;
        post[n-1]=1;
        for(i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(i=n-2;i>=0;i--){
            post[i]=post[i+1]*nums[i+1];
        }
        for(i=0;i<n;i++){
            ans[i]=pre[i]*post[i];
        }
        return ans;
    }
}