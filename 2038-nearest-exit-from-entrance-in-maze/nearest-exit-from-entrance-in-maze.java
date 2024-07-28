class Solution {
        public int nearestExit(char[][] maze, int[] entrance) {
        int row=maze.length;
        int col=maze[0].length;
        Queue<int[]> queue= new LinkedList<>();
        queue.add(entrance);
        maze[entrance[0]][entrance[1]]='+';
        int steps=0;
        int x,y;
        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            steps++;
            int n = queue.size();
            for(int i=0;i<n;i++){
                int[] current=queue.poll();
                for(int[] direction: directions){
                    x=current[0]+direction[0];
                    y=current[1]+direction[1];
                    if(x<0||y<0||x>=row||y>=col||maze[x][y]=='+')
                        continue;
                    if(x==0||y==0||x==row-1||y==col-1)
                        return steps;
                    maze[x][y]='+';
                    queue.add(new int[]{x,y});
                }
            }

        }
        return -1;
    }
}
