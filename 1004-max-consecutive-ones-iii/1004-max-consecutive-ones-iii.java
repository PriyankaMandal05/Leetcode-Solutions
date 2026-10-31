class Solution {
    public int longestOnes(int[] nums, int k) {
        int array[] = new int[2];
        int low =0;
        int result = Integer.MIN_VALUE;
        for(int high =0; high <nums.length; high++){
            array[nums[high]]++;
            int length = high - low +1;
            
            while(array[0] > k){
                array[nums[low]]--;
                low ++;
              length = high - low +1;
            
              
            }
            result = Math.max(result, length);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna