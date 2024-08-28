class Solution {
    public boolean check(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length)
            return false;
        if(grid[i][j]=='0')
            return false;
        else{
            grid[i][j]='0';
            check(grid,i+1,j);
            check(grid,i-1,j);
            check(grid,i,j+1);
            check(grid,i,j-1);
            return true;
        }

    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(check(grid,i,j))
                    count++;
        return count;
    }
}