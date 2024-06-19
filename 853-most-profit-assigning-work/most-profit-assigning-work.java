class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        double[] pbyd= new double[profit.length];
        for(int i=0;i<profit.length;i++){
            pbyd[i]=profit[i]/difficulty[i];
        }
        int sum=0;
        for(int i=0;i<worker.length;i++){
            int max=0;      
            for(int j=0;j<profit.length;j++){
                if(profit[j]>max&&worker[i]>=difficulty[j]){
                    max=profit[j];
                }
            }
            sum+=max;
        }
        return sum;

    }
}