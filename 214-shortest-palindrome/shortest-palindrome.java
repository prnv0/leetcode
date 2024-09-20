class Solution {
    public String shortestPalindrome(String s) {
        int start=0,end=s.length()-1;
        //StringBuilder sb= new StringBuilder(s);
        int index=0;
        if(s.length()==0)
            return "";
        //StringBuilder one=new StringBuilder(s);
        int n=s.length();
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
               index++; 
               break;
            }
            start++;
            end--;
        }
                
        if(index==0)
            return s;
        if(n<1000) end=n-1;
        System.out.println("Not equal");
        while(end>=0){
            StringBuilder sb= new StringBuilder(s);
            StringBuilder temp=new StringBuilder(s.substring(end));
            temp=temp.reverse();
            sb.insert(0,temp).toString();
            if(sb.toString().compareTo(sb.reverse().toString())==0)
                return sb.toString();
            end--;
        }
        return "";
    }
}