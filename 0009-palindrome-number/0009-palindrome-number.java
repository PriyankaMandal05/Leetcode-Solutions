class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        int reverse =0;
        while(x > 0){
            int lastd = x % 10 ;
            reverse = ( reverse *10 )+ lastd;
            x = x /10;

        }
        if(number == reverse){
            return true;
        }
        else{return false;}
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna