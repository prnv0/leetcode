class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false;
        Arrays.sort(hand);
        int curr;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: hand){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: hand){
            int n=0;
           if(map.getOrDefault(i,0)!=0){
            while(n<groupSize){
                if(map.getOrDefault(i+n,0)==0)
                    return false;
                else
                    map.put(i+n,map.get(i+n)-1);
                n++;
            }
            
           }
           
        }
        return true;

    }
}