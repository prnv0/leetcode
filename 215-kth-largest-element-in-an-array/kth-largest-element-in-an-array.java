class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        for(int i:nums){
            if(pq.size()==0||pq.size()<k)
                pq.add(i);
            else if(i>pq.peek()){
                pq.poll();
                pq.add(i);
            }
        }
        return pq.poll();

    }
}