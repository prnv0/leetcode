class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ')
                sb1.append(ch);
            else{
                sb2.append(sb1.reverse());
                sb2.append(" ");
                sb1=new StringBuilder();
            }
        }
        sb2.append(sb1.reverse());
        return sb2.toString();
    }
}