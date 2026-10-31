class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;

        int candidate1 = 0;
        int candidate2 = 0;

        int vote1 = 0;
        int vote2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (vote1 == 0 && nums[i] != candidate2) {
                candidate1 = nums[i];
                vote1++;
            } else if (vote2 == 0 && nums[i] != candidate1) {
                candidate2 = nums[i];
                vote2++;
            } else if (candidate1 == nums[i]) {
                vote1++;
            } else if (candidate2 == nums[i]) {
                vote2++;
            } else {
                vote1--;
                vote2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                freq1++;
            } else if (nums[i] == candidate2) {
                freq2++;
            }
        }
        if (freq1 > n) {
            res.add(candidate1);
        }
        if (freq2 > n) {
            res.add(candidate2);
        }

        return res;
    }
}