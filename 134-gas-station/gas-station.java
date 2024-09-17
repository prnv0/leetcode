class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff=new int[gas.length];
        int total=0;
        for(int i=0;i<gas.length;i++){
            diff[i]=gas[i]-cost[i];
            total+=diff[i];
        }
        if(total<0)
            return -1;
        else 
            total=0;
        int start=0;
        for(int i=0;i<diff.length;i++){
            total+=diff[i];
            if(total<0){
                total=0;
                start=i+1;
            }
        
        }
        return start;
    }
}