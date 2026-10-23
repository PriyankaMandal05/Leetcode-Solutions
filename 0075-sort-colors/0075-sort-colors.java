class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length -1;
while(mid <= high){
        switch(nums[mid]) {
            case 0:
            // swap(arr, start index, ending index)
            int temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            mid ++;
            low++;
            break;

            case 1:
            // BEST CASE
            mid ++;
             break;

            case 2:
             temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high --;
             break;
        }
        }
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna