class Solution {
    public int maxSubArray(int[] nums) {
        // Time Complexity: O(n) – single pass through the array.
        // Space Complexity: O(1) – only a few integer variables.
        // This matches the optimal complexity for the problem.
        // However, the current implementation has a subtle bug for
        // arrays where all numbers are negative.
        // Reason: when currentsum becomes negative, you reset it to 0.
        // This makes maxsum potentially 0, which is incorrect because the
        // answer should be the largest (least negative) element.
        // Hint: Instead of resetting to 0, consider whether starting a new
        // subarray at the current element yields a larger sum.
        // You can compute the new currentsum as:
        //   currentsum = Math.max(nums[i], currentsum + nums[i]);
        // Then update maxsum with the new currentsum.
        // This handles both positive and all‑negative cases correctly.
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0 ;
        for(int i =0; i< nums.length ; i++){
            currentsum = currentsum + nums[i];
            // if( currentsum < 0){
            //      currentsum = 0;
            // }
         maxsum = Math.max( currentsum,maxsum);  
         if( currentsum < 0){
                 currentsum = 0;
            } 
        }
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna