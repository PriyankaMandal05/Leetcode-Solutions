class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i +1;
        int unique = 1;

        while(j< nums.length){
            if(nums[j] == nums[j-1]){
                j++;
            }
            else{
                nums[i+1] = nums[j];
                unique ++;
                i++;
                j++;
            }
        }
        return unique;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna