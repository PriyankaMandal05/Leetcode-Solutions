class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Time Complexity: O(n^2) after sorting (O(n log n) dominates for large n)
        // Space Complexity: O(1) extra space (excluding output list)
        // Approach: Sort the array and then use a fixed element with two-pointer scan to find pairs that sum to -fixed.
        // This avoids O(n^3) brute force and handles duplicates efficiently.
        // OPTIMAL APPROACH
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sorting enables two-pointer technique and duplicate skipping
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate fixed elements to avoid duplicate triplets in result
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;
            while (left_pointer < right_pointer) {
                int sum = nums[i] + nums[left_pointer] + nums[right_pointer];
                if (sum == 0) {
                    // Found a valid triplet
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left_pointer]);
                    triplet.add(nums[right_pointer]);
                    result.add(triplet);
                    // Move pointers past duplicates to ensure uniqueness of next triplet
                    while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer + 1]) {
                        left_pointer++;
                    }
                    while (left_pointer < right_pointer && nums[right_pointer] == nums[right_pointer - 1]) {
                        right_pointer--;
                    }
                    left_pointer++;
                    right_pointer--;
                } else if (sum < 0) {
                    // Need a larger sum; move left pointer rightward
                    left_pointer++;
                } else {
                    // Need a smaller sum; move right pointer leftward
                    right_pointer--;
                }
            }
        }
        // Return a new list to avoid exposing internal list reference (optional)
        // return new ArrayList<>(result);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna