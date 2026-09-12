class Solution {

    int n;
    int[][] intervals;
    int[] nextIdx;

    static class Result {
        long score;
        List<Integer> indices;

        Result(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    Result[][] dp;

    // Find first interval whose start > current end
    int findNext(int i) {

        int end = intervals[i][1];

        int lo = i + 1;
        int hi = n - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (intervals[mid][0] > end) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    boolean lexicographicallySmaller(
            List<Integer> a,
            List<Integer> b) {

        int len = Math.min(a.size(), b.size());

        for (int i = 0; i < len; i++) {

            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) < b.get(i);
            }
        }

        return a.size() < b.size();
    }

    Result solve(int i, int k) {

        // No intervals allowed
        if (k == 0 || i >= n) {
            return new Result(
                    0,
                    new ArrayList<>()
            );
        }

        if (dp[i][k] != null) {
            return dp[i][k];
        }

        // ----------------
        // 1. SKIP
        // ----------------

        Result skip = solve(i + 1, k);


        // ----------------
        // 2. TAKE
        // ----------------

        int next = nextIdx[i];

        Result nextResult = solve(next, k - 1);

        List<Integer> takeIndices =
                new ArrayList<>(nextResult.indices);

        takeIndices.add(intervals[i][3]);

        // Important:
        // Answer indices must be sorted
        Collections.sort(takeIndices);

        Result take = new Result(
                intervals[i][2] + nextResult.score,
                takeIndices
        );


        // ----------------
        // Compare
        // ----------------

        Result result;

        if (take.score > skip.score) {

            result = take;

        } else if (skip.score > take.score) {

            result = skip;

        } else {

            // Same score
            if (lexicographicallySmaller(
                    take.indices,
                    skip.indices)) {

                result = take;

            } else {

                result = skip;
            }
        }

        dp[i][k] = result;

        return result;
    }


    public int[] maximumWeight(
            List<List<Integer>> intervalsList) {

        n = intervalsList.size();

        intervals = new int[n][4];

        // [start, end, weight, originalIndex]
        for (int i = 0; i < n; i++) {

            intervals[i][0] =
                    intervalsList.get(i).get(0);

            intervals[i][1] =
                    intervalsList.get(i).get(1);

            intervals[i][2] =
                    intervalsList.get(i).get(2);

            intervals[i][3] = i;
        }


        // Sort by start
        Arrays.sort(
                intervals,
                (a, b) -> Integer.compare(a[0], b[0])
        );


        // Find next compatible interval
        nextIdx = new int[n];

        for (int i = 0; i < n; i++) {
            nextIdx[i] = findNext(i);
        }


        // DP
        dp = new Result[n + 1][5];


        Result result = solve(0, 4);


        // Convert List<Integer> -> int[]
        int[] ans = new int[result.indices.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.indices.get(i);
        }

        return ans;
    }
}