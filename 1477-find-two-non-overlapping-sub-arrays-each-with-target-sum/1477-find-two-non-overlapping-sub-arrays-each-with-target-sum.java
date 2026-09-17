class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minBestLengthTillIdx = new int[n];
        Arrays.fill(minBestLengthTillIdx, Integer.MAX_VALUE);
        int currsum = 0;
        int bestMinLength = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (j < n) {
            currsum += arr[j];
            while (i < j && currsum > target) {
                currsum -= arr[i++];
            }
            if (currsum == target) {
                int length = j - i + 1;
                if (i > 0 && minBestLengthTillIdx[i - 1] != Integer.MAX_VALUE) {
                    result = Math.min(result, length + minBestLengthTillIdx[i - 1]);
                }
                bestMinLength = Math.min(bestMinLength, length);
            }
            minBestLengthTillIdx[j] = bestMinLength;
            j++;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}