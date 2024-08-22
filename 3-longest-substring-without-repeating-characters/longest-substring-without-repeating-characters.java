class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int[] a= new int[256];
        int max=0;
        while(i<s.length()){
            while(i<s.length()&&a[s.charAt(i)]!=1){
                a[s.charAt(i)]=1;
                i++;
            }
            max=Math.max(max,i-j);
            a[s.charAt(j)]=0;
            j++;
            
        }
        return max;
    }
}