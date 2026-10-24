class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int low =0;
        int high = k-1;
        int sum = 0;
        int result = Integer.MIN_VALUE;
        
        for(int i= low ; i<= high; i++){
            
            sum = sum + arr[i];
            
        }
        
        while(high < arr.length){
            result = Math.max(result, sum);
            
            low ++;
            high++;
            if(high == arr.length){
                break;
            }
            sum = sum - arr[low-1];
            sum = sum + arr[high];
            
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna