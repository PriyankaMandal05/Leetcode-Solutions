class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] answer = new int[nums.length];
        answer[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            answer[i] = answer[i-1] + nums[i];

        }
        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna