class Solution {
    public int minLength(String s) {
        
        while(s.indexOf("AB")!=-1||s.indexOf("CD")!=-1){
            s=s.replace("AB","");
            s=s.replace("CD","");
        }
        return s.length();
    }
}