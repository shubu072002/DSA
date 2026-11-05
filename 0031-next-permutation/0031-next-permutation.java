class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (i > 0 && nums[i - 1] < nums[i]) {
                pivot = i - 1;
                break;
            }
        }
        int nextGreaterIdx = 0;
        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    nextGreaterIdx = i;
                    break;
                }
            }
            swap(nums, pivot, nextGreaterIdx);
        }
        reverse(nums, pivot + 1, n - 1);
    }
}