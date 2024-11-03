class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb= new StringBuilder(s);
        if(s.compareTo(goal)==0)
            return true;
        for(int i=0;i<s.length();i++){
            //System.out.println(sb.toString());
            sb=sb.append(sb.substring(0,1));
            sb.deleteCharAt(0);
            if(sb.toString().compareTo(goal)==0)
            return true;
        }
        return false;
    }
}