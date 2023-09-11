class Solution {
    public String reverseVowels(String s) {
        int i=0,j=0;
        int len=s.length();
        String out="";
        char[] vowels=new char[300000];
        for(i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='a'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowels[j++]=c;
            }

        }
        for(i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='a'||c=='E'||c=='I'||c=='O'||c=='U'){
                out=out+vowels[--j];
            }
            else
                out=out+c;

        }
        return out;
    }
}