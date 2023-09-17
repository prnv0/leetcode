class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos=0,prevpos=-1,j=0,reduction=0;
        for(int i=0;i<s.length();i++){
            pos=t.indexOf(s.charAt(i));
            if(pos==-1)
                return false;
            else
            t=t.substring(pos+1,t.length()).intern();
            
        }
        return true;
    }
}