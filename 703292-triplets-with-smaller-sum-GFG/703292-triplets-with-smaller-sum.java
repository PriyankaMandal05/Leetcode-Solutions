class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
       int count = 0;
        for(int i = 0; i< arr.length-2 ; i++){
            int leftp = i+1 ;
            int rightp = arr.length -1;
            
            while(leftp < rightp){
              int current_sum = arr[i] + arr[leftp]+ arr[rightp];
                if(current_sum >= sum){
                   
                    rightp --;
                    
                }
                else{
                    // current_sum < sum
                    count +=  rightp - leftp ;
                    leftp ++;
                }
            }
            
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna