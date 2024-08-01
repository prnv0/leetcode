class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        System.out.println(freq);
        List<Integer>[] buckets=new List[nums.length+1];
        for(int i:freq.keySet()){
            int f=freq.get(i);
            if(buckets[f]==null)
                buckets[f]=new LinkedList<>();
            buckets[f].add(i);
        }
        int[] result = new int[k];
        int p=0;
        for(int i=buckets.length-1;i>0&&k>0;i--){
            if(buckets[i]!=null){
                List<Integer> list= buckets[i];
                for(int g:list){
                    result[p]=g;
                    p++;
                }
                k-=list.size();
            }
        }
        return result;
    }
}