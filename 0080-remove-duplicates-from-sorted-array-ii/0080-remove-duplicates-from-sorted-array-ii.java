class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2; //traverse array
        int j=2; // decides position
        while(i< nums.length){
            if(nums[i] != nums[j-2]){
                nums[j++] = nums[i];
            }
           i++;
        }
        return j;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna