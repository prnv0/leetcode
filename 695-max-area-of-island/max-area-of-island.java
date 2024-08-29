class Solution {
    public int check(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length)
            return 0;
        if(grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        return check(grid,i+1,j)+check(grid,i-1,j)+check(grid,i,j+1)+check(grid,i,j-1)+1;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                area=Math.max(area,check(grid,i,j));
            }
        return area;
    }
}