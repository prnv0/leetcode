class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        int row = grid.length;
        int col = row;
        for(int i=0;i<row;i++){
            String out="";
            for(int j=0;j<col;j++)
                out+="_"+grid[i][j];
            map.put(out,map.getOrDefault(out,0)+1);
        }
        int count=0;
        for(int i=0;i<row;i++){
            String out="";
            for(int j=0;j<col;j++){
                out+="_"+grid[j][i];
                
            }
            count+=map.getOrDefault(out,0);

        }
        return count;

    }
}