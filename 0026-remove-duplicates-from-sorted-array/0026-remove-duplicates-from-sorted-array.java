class Solution {
    public int removeDuplicates(int[] nums) {
      int alloted = 0;
      int check_unique = 1;
     int  unique_elements =  1;

      while(check_unique < nums.length){
       
        if(nums[check_unique] == nums[check_unique - 1]){
            // not unique
            check_unique ++;
            continue;
        }
        else{
            nums[alloted + 1] = nums[check_unique];
            alloted ++;
            unique_elements ++;

            check_unique ++;
        }
       }
      
      return unique_elements;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna