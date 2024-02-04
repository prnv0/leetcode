class Solution {
    public String removeStars(String s) {
        String word="";
        int i=0;
        int top=0;
        char[] ch=new char[s.length()];
        while(i<s.length()){
            if(s.charAt(i)=='*'){
                top--;
            }
            else{
                ch[top++]=s.charAt(i);
            }
            i++;
            //System.out.println(String.valueOf(ch));
        }
        s=String.valueOf(ch);
        return s.substring(0,top);
    }
}