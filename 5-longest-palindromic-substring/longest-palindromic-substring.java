class Solution {
    public String longestPalindrome(String s) {
        int i=0,left,right,max=0;
        String maxstring="";
        while(i<s.length()){
            left=i;
            while(i<s.length() - 1 &&s.charAt(i)==s.charAt(i+1)){
                i++;
            }
            right=i;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                System.out.println(left+" "+right);

                left--;
                right++;
            }
            // System.out.println(left+" "+right);
            maxstring= right-left-1>max?s.substring(left+1,right):maxstring;
            max=maxstring.length();
            i++;
        }
        return maxstring;
    }
}