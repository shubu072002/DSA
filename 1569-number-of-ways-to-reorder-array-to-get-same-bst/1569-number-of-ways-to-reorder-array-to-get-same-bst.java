
import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;
    private long[][] choose;

    public int numOfWays(int[] nums) {
        int n = nums.length;

        // Precompute combinations: choose[n][r] = C(n, r)
        choose = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            choose[i][0] = 1;
            choose[i][i] = 1;

            for (int j = 1; j < i; j++) {
                choose[i][j] =
                    (choose[i - 1][j - 1] + choose[i - 1][j]) % MOD;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Subtract 1 to exclude the original ordering
        return (int) ((dfs(list) - 1 + MOD) % MOD);
    }

    private long dfs(List<Integer> nums) {
        int n = nums.size();

        // Empty or single-element subtree
        if (n <= 2) {
            return 1;
        }

        int root = nums.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // Divide elements according to the BST root
        for (int i = 1; i < n; i++) {
            int value = nums.get(i);

            if (value < root) {
                left.add(value);
            } else {
                right.add(value);
            }
        }

        // Number of ways to interleave left and right
        long interleavings =
            choose[left.size() + right.size()][left.size()];

        // Combine all three independent contributions
        long leftWays = dfs(left);
        long rightWays = dfs(right);

        return (((interleavings * leftWays) % MOD)
                * rightWays) % MOD;
    }
}
