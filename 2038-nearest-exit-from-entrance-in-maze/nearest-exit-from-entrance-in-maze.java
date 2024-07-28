class Solution {
    int nearestExitDistance = Integer.MAX_VALUE;
    int[] entrance;

    // public void dfs(char[][] maze, int posx, int posy, int steps) {

    //     if (posx < 0 || posy < 0 || posx >= maze.length || posy >= maze[0].length || maze[posx][posy] == '+') {
    //         return;
    //     }
    //     if ((posx == 0 || posy == 0 || posx == maze.length - 1 || posy == maze[0].length - 1) 
    //         && !(posx == entrance[0] && posy == entrance[1])) {
    //         nearestExitDistance = Math.min(nearestExitDistance, steps);
    //         return;
    //     }
    //     maze[posx][posy] = '+';
    //     dfs(maze, posx + 1, posy, steps + 1);
    //     dfs(maze, posx - 1, posy, steps + 1);
    //     dfs(maze, posx, posy + 1, steps + 1);
    //     dfs(maze, posx, posy - 1, steps + 1);
    // }

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int steps = current[2];

            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && maze[newX][newY] == '.') {
                    if (newX == 0 || newX == rows - 1 || newY == 0 || newY == cols - 1) {
                        return steps + 1;
                    }
                    maze[newX][newY] = '+';
                    queue.add(new int[]{newX, newY, steps + 1});
                }
            }
        }

        return -1;
    }
}
