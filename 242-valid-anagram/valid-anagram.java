class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> set1= new HashMap<>();
        char ch1,ch2;
        for(int i=0;i<s.length();i++){
            ch1=s.charAt(i);
            ch2=t.charAt(i);
            set1.put(ch1,set1.getOrDefault(ch1,0)+1);
            set1.put(ch2,set1.getOrDefault(ch2,0)-1);
       } 
       for(int val : set1.values()){
        if(val!=0)
            return false;
       }
       return true;
    }
}