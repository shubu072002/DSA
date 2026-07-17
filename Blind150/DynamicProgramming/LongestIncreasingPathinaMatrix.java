package Blind150.DynamicProgramming;

public class LongestIncreasingPathinaMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n + 1][m + 1];
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxLength = Math.max(maxLength, helper(matrix, dir, i, j, n, m, dp));
            }
        }
        return maxLength;
    }

    public int helper(int[][] matrix, int[][] directions, int r, int c, int n, int m, int[][] dp) {
        int currLength = 1;
        if (dp[r][c] != 0) {
            return dp[r][c];
        }

        for (int[] dir : directions) {
            int x = r + dir[0];
            int y = c + dir[1];

            if (x < 0 || y < 0 || x >= n || y >= m) {
                continue;
            }
            if (matrix[r][c] >= matrix[x][y]) {
                continue;
            }
            currLength = Math.max(currLength, 1 + helper(matrix, directions, x, y, n, m, dp));
        }
        return dp[r][c] = currLength;
    }
}
