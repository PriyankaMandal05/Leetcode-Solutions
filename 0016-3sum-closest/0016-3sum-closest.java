class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
            int max_diff = Integer.MAX_VALUE;
            int result = 0;
        for (int i = 0; i < nums.length-2 ; i++) {
            int left_p = i + 1;
            int right_p = nums.length - 1;
            

            while (left_p < right_p) {
                int sum = nums[i] + nums[left_p] + nums[right_p];
            int diff = Math.abs(sum - target);
            if (diff < max_diff) {
                max_diff = diff;
                result = sum;

            }
                if (sum == target) {
                    left_p++;
                    right_p--;

                } else if (sum < target) {
                    left_p++;
                } else {
                    right_p--;
                }
            }

        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna