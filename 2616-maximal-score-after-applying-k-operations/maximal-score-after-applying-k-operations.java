class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Double> pq= new PriorityQueue<Double>(Collections.reverseOrder());
        for(double i:nums){
            pq.add(i);
        }
        double result=0;
        for(int i=0;i<k;i++){
            double temp=pq.poll();
            result+=temp;
            pq.add(Math.ceil(temp/3));
        }
        return (long)result;
    }
}