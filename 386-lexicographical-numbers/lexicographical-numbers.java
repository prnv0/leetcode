class Solution {
    List<Integer> list= new ArrayList<>();
    public void dfs(int i,int n){
        if(i>n)
            return;
        list.add(i);
        for(int j=0;j<10;j++)
            dfs(i*10+j,n);
        return;
    }
    public List<Integer> lexicalOrder(int n) {
        for(int i=1;i<10;i++)
            dfs(i,n);
        return list;
    }
}