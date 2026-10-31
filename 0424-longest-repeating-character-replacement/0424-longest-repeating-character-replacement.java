class Solution {
    public int characterReplacement(String s, int k) {
        int array[] = new int[255];
        int low =0;
        int result = Integer.MIN_VALUE;
        for(int high =0; high < s.length() ; high ++){
            array[s.charAt(high)]++;
           
            int length = high - low +1;
            
            int maxfreq = Integer.MIN_VALUE;
            for(int i =0; i < array.length; i++){
                maxfreq = Math.max(maxfreq, array[i]);
            }
               
            int diff = length - maxfreq;

            while(diff > k){
                array[s.charAt(low)] --;
                low ++;
                length = high - low +1;
            for(int i =0; i < array.length; i++){
                maxfreq = Math.max(maxfreq, array[i]);
            }
               
             diff = length - maxfreq;

            } 
            result = Math.max(result, length);

        }
        return result;
        

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna