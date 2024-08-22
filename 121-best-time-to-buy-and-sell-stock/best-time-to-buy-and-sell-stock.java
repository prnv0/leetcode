class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] max = new int[n];
        int result=0;
        max[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(prices[i],max[i+1]);
        }
        for(int i=0;i<n;i++){
            if((max[i]-prices[i])>0)
                result=Math.max(result,max[i]-prices[i]);
        }
        return result;
    }
}