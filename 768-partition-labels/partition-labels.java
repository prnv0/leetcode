class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch=s.toCharArray();
        int end=0;
        //store last index of each character
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],i);
        }
        int endprev=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            end=Math.max(end,map.get(ch[i]));
            if(i==end){
                list.add(i+1-endprev);
                endprev=end+1;
            }
        }
        return list;
    }
}