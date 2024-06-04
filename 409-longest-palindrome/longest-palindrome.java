class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[52];
        Arrays.fill(count, 0);
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A'] += 1;
            } else if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a' + 26] += 1;
            }
        }
        int c=0;
        for(int i=0;i<52;i++){
            if(count[i]!=0||count[i]!=1)
                if(count[i]%2==0)
                    c+=count[i];
                else 
                    c+=count[i]-1;
        }
        if(s.length()>c)
            return c+1;
        return c;
    }
}