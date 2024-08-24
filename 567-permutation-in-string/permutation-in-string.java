class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int j=0;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        int front = 0;
        int back = s1.length();
        if(s1.length()>s2.length())
            return false;
        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(arr1, arr2)) return true;
        while(back < s2.length()){
            arr2[s2.charAt(front) - 'a']--;
            arr2[s2.charAt(back) - 'a']++;
            
            if(Arrays.equals(arr1, arr2)) return true;
            front++;
            back++;
        }
        return false;
    }
}