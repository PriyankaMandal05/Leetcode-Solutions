class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Two-pointer approach works because the array is sorted.
        // Time Complexity: O(n) where n is numbers.length.
        // Space Complexity: O(1) extra space (ignoring output array).
        int i = 0;
        int j = numbers.length-1;
        while(i< j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                
                // IN ques mentioned as 1- indexed array : return new int[] {i + 1, j + 1};
                return new int[] {i+1,j+1};
            }
            else if( sum < target){
                i++;
            }
            else{ j-- ; }
        }
        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna