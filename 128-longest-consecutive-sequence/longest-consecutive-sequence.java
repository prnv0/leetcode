class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int i:nums){
            list.add(i);
        }
        int maxlen=0;
        for(int i:nums){
            int len=1;
            int x=i;
            while(list.contains(--x)){
                len++;
                list.remove(x);
            }
            x=i;
            while(list.contains(++x)){
                len++;
                list.remove(x);
            }
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}