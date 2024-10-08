class Solution {
    public int minSwaps(String s) {
        int open=0,closed=0,swap=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                open++;
            }
                
            if(s.charAt(i)==']'){
                closed++;
            }

            if(closed>open){
                swap++;
                open++;
                closed--;
            }
        }
        return swap;
    }
}