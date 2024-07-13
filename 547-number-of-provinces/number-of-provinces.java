class Solution {
    public void dfs(int[][] matrix,int[] visited,int i){
        for(int j=0;j<matrix.length;j++){
            if(matrix[i][j]==1&&visited[j]!=1){
                visited[j]=1;
                dfs(matrix,visited,j);
            }
                
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int[] visited= new int[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]!=1){
                dfs(isConnected,visited,i);
                count++;
            }
        }
        return count;
    }
}