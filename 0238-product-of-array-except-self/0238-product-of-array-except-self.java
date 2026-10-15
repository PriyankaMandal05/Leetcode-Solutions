class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, 1);

        // stored prefix in answer array itself
        for (int i = 1; i < n; i++) {

            answer[i] = answer[i - 1] * nums[i - 1];
        }
        //suffix
        int suffix = 1;
        for (int j = n - 2; j >= 0; j--) {

            suffix *= nums[j + 1];
            //here we multiplied ans array(prefix) with suffix for final answer
            answer[j] *= suffix;
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna