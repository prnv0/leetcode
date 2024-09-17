class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] split1=s1.split(" ");
        List<String> list= new ArrayList<>();
        for(String x:split1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        String[] split2=s2.split(" ");
        for(String x:split2){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(String x:map.keySet())
            if(map.get(x)==1)
                list.add(x);
        
        return list.toArray(new String[0]);
    }
}