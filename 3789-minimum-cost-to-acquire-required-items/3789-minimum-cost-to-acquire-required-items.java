class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        // Case A: bundle is costlier than buying items separately
        if (cost1 + cost2 <= costBoth) {
            return 1L * cost1 * need1 + 1L * cost2 * need2;
        }

        // Case B: bundle is better
        // Buy bundles as much as you can
        int both = Math.min(need1, need2);
        long total = 1L * both * costBoth;

        need1 -= both;
        need2 -= both;

        // Pending ones
        if (need1 > 0) {
            total += 1L * need1 * Math.min(cost1, costBoth);
        } else if (need2 > 0) {
            total += 1L * need2 * Math.min(cost2, costBoth);
        }

        return total;
    }
}