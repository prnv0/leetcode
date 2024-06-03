class Solution {
    public int appendCharacters(String s, String t) {
        
        int si = 0, ti = 0;
        int sLength = s.length(), tLength = t.length();
        
        while (si < sLength && ti < tLength) {
            if (s.charAt(si) == t.charAt(ti)) {
                ti++;
            }
            si++;
        }
        
        return tLength - ti;
    }
}