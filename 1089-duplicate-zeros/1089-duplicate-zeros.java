class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length;

        // Count how many zeros can actually be duplicated
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1;

        // Fill the array from right to left
        while (i >= 0 && j >= 0) {

            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;

                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}