class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<Long>(Collections.reverseOrder());
        for(long i:nums){
            pq.add(i);
        }
        long result=0;
        for(int i=0;i<k;i++){
            double temp=pq.poll();
            result+=temp;
            pq.add((long)Math.ceil(temp/3));
        }
        return result;
    }
}