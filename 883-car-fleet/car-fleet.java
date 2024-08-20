class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Double[][] time = new Double[position.length][2];
        for(int i=0;i<position.length;i++){
            time[i][0]=(double)position[i];
            time[i][1]=(double)(target-position[i])/speed[i];
        }
        double min=0;
        int result=0;
        Arrays.sort(time, (a,b)->Double.compare(a[0],b[0]));
        for(int i=position.length-1;i>=0;i--){
            if(time[i][1]>min){
                result++;
                min=time[i][1];
            }
        }
        return result;
    }
}