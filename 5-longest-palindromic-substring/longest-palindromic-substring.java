class Solution {
    public String longestPalindrome(String s) {
        int i=0,left,right,max=0;
        String maxstring="";
        while(i<s.length()){
            left=i;
            right=i;

            while(right<s.length() &&s.charAt(left)==s.charAt(right)){
                right++;
            }
            right--;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
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