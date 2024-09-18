class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i:stones)
            pq.add(-i);
        while(pq.size()!=1){
            int a=-pq.poll();
            int b=-pq.poll();
            System.out.println(a+"-"+b);
            pq.add(-(a-b));
        }
        return -pq.poll();
    }
}