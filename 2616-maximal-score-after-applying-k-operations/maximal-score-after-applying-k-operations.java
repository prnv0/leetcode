class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<Long>(Collections.reverseOrder());
        for(int i:nums){
            pq.add((long)i);
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