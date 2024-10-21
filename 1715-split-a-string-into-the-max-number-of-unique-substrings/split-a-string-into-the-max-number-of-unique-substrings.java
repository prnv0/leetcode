class Solution {
    public int backtrack(int start,String s,HashSet<String> seen){
        if(start==s.length())
            return 0;
        int maxsplit=0;
        for(int end=start+1;end<=s.length();end++){
            String sub=s.substring(start,end);
            if(!seen.contains(sub)){
                seen.add(sub);
                maxsplit=Math.max(maxsplit,1+backtrack(end,s,seen));
                seen.remove(sub);
            }
        }
        return maxsplit;
    }
    public int maxUniqueSplit(String s) {
        
        return backtrack(0,s,new HashSet<>());
    }
}