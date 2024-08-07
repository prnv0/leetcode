class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch<='9'&&ch>='0'))
                sb.append(s.charAt(i));
        }
        String out=sb.toString();
        out=out.toLowerCase();
        System.out.println(out.length());
        if(out.length()==1)
            return true;
        for(int i=0;i<out.length()/2;i++){
            if(out.charAt(i)!=out.charAt(out.length()-i-1))
                return false;
        }
        return true;
    }
}