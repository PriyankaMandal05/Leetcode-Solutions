class Solution {
    public int[] twoSum(int[] nums, int target) {
        // The current approach uses a brute‑force double loop.
        // Time Complexity: O(n²) – each element is paired with every later element.
        // Space Complexity: O(1) – no additional data structures are used.
        // However, the loop conditions are incorrect:
        //   `i = nums.length - 1` and `j = nums.length - 1` are assignments, not comparisons.
        //   They should be something like `i < nums.length` and `j < nums.length`.
        // Fixing the conditions will make the code compile, but the algorithm will still be O(n²).
        // Hint: An optimal solution runs in O(n) time using a HashMap to store each number's index
        // and checking for `target - nums[i]` as you iterate.
        for(int i = 0; i <= nums.length -1; i++){
            for(int j = i+1 ; j <= nums.length-1 ; j++){
                if(nums[i]+ nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        // If no pair adds up to the target, an empty array is returned per problem specification.
        return new int[]{};
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna