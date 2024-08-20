class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        backtrack(result,"",0,0,n);
        return result;
    }
    public void backtrack(List<String> list, String str,int open,int close,int n){
        if(open==close&&open==n){
            list.add(str);
            return;
        }
        if(open<n)
            backtrack(list,str+"(",open+1,close,n);
        if(close<open)
            backtrack(list,str+")",open,close+1,n);
    }
}