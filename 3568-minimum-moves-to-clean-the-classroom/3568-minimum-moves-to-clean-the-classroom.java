class Solution {

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        // litter[i][j] = litter number at this cell
        // -1 means this cell is not litter
        int[][] litter = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(litter[i], -1);
        }

        int startRow = 0;
        int startCol = 0;
        int litterCount = 0;

        // Find S and assign index to every L
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startRow = i;
                    startCol = j;
                }

                else if (ch == 'L') {
                    litter[i][j] = litterCount;
                    litterCount++;
                }
            }
        }

        // No litter
        if (litterCount == 0) {
            return 0;
        }

        // All litter collected mask
        int fullMask = (1 << litterCount) - 1;

        /*
            visited[row][col][energy][mask]

            true = this state has already been visited
        */
        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << litterCount];

        /*
            Queue state:

            [row, col, currentEnergy, mask]
        */

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{
                startRow,
                startCol,
                energy,
                0
        });

        visited[startRow][startCol][energy][0] = true;

        int moves = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Process one BFS level
            for (int k = 0; k < size; k++) {

                int[] state = queue.poll();

                int row = state[0];
                int col = state[1];
                int currentEnergy = state[2];
                int mask = state[3];

                // All litter collected
                if (mask == fullMask) {
                    return moves;
                }

                // Cannot make another move
                if (currentEnergy == 0) {
                    continue;
                }

                // Try 4 directions
                for (int d = 0; d < 4; d++) {

                    int newRow = row + dr[d];
                    int newCol = col + dc[d];

                    // Outside grid
                    if (newRow < 0 || newRow >= m ||
                        newCol < 0 || newCol >= n) {
                        continue;
                    }

                    // Obstacle
                    if (classroom[newRow].charAt(newCol) == 'X') {
                        continue;
                    }

                    // One move costs one energy
                    int newEnergy = currentEnergy - 1;

                    // If we reached R, reset energy
                    if (classroom[newRow].charAt(newCol) == 'R') {
                        newEnergy = energy;
                    }

                    // Current mask
                    int newMask = mask;

                    // If this cell contains litter
                    if (classroom[newRow].charAt(newCol) == 'L') {

                        int litterIndex =
                                litter[newRow][newCol];

                        newMask =
                                newMask | (1 << litterIndex);
                    }

                    // Already visited this exact state
                    if (visited[newRow][newCol]
                                      [newEnergy]
                                      [newMask]) {
                        continue;
                    }

                    visited[newRow][newCol]
                            [newEnergy]
                            [newMask] = true;

                    queue.offer(new int[]{
                            newRow,
                            newCol,
                            newEnergy,
                            newMask
                    });
                }
            }

            // One BFS level = one additional move
            moves++;
        }

        return -1;
    }
}