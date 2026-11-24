class Solution {
    void segregate0and1(int[] arr) {
        
        int pointer1 = 0;
        int pointer2 = arr.length-1;
        while(pointer1 < pointer2){
            if(arr[pointer1] != 0 && arr[pointer2] !=1 ){
                int swap = arr[pointer1];
                arr[pointer1] = arr[pointer2];
                arr[pointer2] = swap;
                
            }
            else if(arr[pointer1] == 0){
                pointer1 ++;
            }
            else{pointer2 --;}
        }
       
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna