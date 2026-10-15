class Solution {
    public int[] productExceptSelf(int[] nums) {
        // The variable 'n' is used but not declared. You need to declare it, e.g., int n = nums.length;
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        Arrays.fill(prefix, 1);
        Arrays.fill(suffix, 1);
        Arrays.fill(answer, 1);
        //prefix 
        // This loop accesses prefix[i-1] and nums[i-1] when i = 0, which leads to an IndexOutOfBoundsException.
        // You should start the loop from i = 1, or handle the i = 0 case separately.
        for (int i = 1; i < n; i++) {
            
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        //suffix
        // Similar to the prefix loop, this loop accesses suffix[j+1] and nums[j+1] when j = n-1,
        // causing an IndexOutOfBoundsException. Start from j = n-2 or adjust the bounds.
        for (int j = n - 2; j >= 0; j--) {
             
            suffix[j] = suffix[j + 1] * nums[j + 1];
        }
        // answer array
        // Here you use 'i' and 'j' which are out of scope; you probably meant to use 'k'.
        // Also, you should multiply prefix[k] and suffix[k] to get the final answer.
        for (int k = 0; k < n; k++) {
            answer[k] = prefix[k] * suffix[k];
        }

        // Current approach uses O(n) extra space for prefix and suffix arrays.
        // Time complexity is O(n) due to three linear passes.
        // The optimal solution can achieve O(1) extra space (excluding the output array) by reusing the answer array.
        // Hint: First fill answer with prefix products, then iterate from the end to incorporate suffix products using a running product variable.

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna