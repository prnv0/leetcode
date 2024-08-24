class Solution {
    public int characterReplacement(String s, int k) {
        int max=0,i=0,j=0;
        int result=0;
        int[] a= new int[26];
        while(i<s.length()){
            a[s.charAt(i)-'A']++;
            max=Math.max(max,a[s.charAt(i)-'A']);
            if(i-j+1-max>k){
                a[s.charAt(j)-'A']--;
                j++;
            }
            result=Math.max(result,i-j+1);
            i++;
        }
        return result;
    }
}