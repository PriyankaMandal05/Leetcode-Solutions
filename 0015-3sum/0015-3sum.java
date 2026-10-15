class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // OPTIMAL APPROACH
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left_pointer < right_pointer) {
                int sum = nums[i] + nums[left_pointer] + nums[right_pointer];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left_pointer]);
                    triplet.add(nums[right_pointer]);
                    result.add(triplet);

                    while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer + 1]) {
                        left_pointer++;
                    }
                    while (left_pointer < right_pointer && nums[right_pointer] == nums[right_pointer - 1]) {
                        right_pointer--;
                    }
                    left_pointer++;
                    right_pointer--;
                }
                 else if (sum < 0) {
                    left_pointer++;
                } 
                else {
                    right_pointer--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna