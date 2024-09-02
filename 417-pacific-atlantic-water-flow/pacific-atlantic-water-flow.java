class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Queue<int[]> pacific = new LinkedList<>();
        Queue<int[]> atlantic = new LinkedList<>();
        int m = heights.length, n = heights[0].length;
        boolean[][] vpacific = new boolean[m][n];
        boolean[][] vatlantic = new boolean[m][n];

        // pacific horizontal
        for (int i = 0; i < n; i++) {
            pacific.add(new int[]{0, i});
            vpacific[0][i] = true;
        }
        // pacific vertical
        for (int i = 0; i < m; i++) {
            pacific.add(new int[]{i, 0});
            vpacific[i][0] = true;
        }
        // atlantic horizontal
        for (int i = 0; i < n; i++) {
            atlantic.add(new int[]{m - 1, i});
            vatlantic[m - 1][i] = true;
        }
        // atlantic vertical
        for (int i = 0; i < m; i++) {
            atlantic.add(new int[]{i, n - 1});
            vatlantic[i][n - 1] = true;
        }

        bfs(heights, pacific, vpacific);
        bfs(heights, atlantic, vatlantic);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (vpacific[i][j] && vatlantic[i][j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    res.add(temp);
                }
            }
        return res;
    }

    int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public void bfs(int[][] matrix, Queue<int[]> queue, boolean[][] visited) {
        int m = matrix.length;
        int n = matrix[0].length;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] d : dir) {
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                if (x < 0 || y < 0 || x >= m || y >= n || visited[x][y] || matrix[x][y] < matrix[cur[0]][cur[1]])
                    continue;
                visited[x][y] = true;
                queue.add(new int[]{x, y});
            }
        }
    }
}
