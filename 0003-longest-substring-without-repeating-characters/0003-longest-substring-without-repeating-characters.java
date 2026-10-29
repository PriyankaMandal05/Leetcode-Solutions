class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int result = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        for(int high =0; high < n; high++){
            char recent = s.charAt(high);
            map.put(recent, map.getOrDefault(recent,0) +1);

            int k = high - low +1;

            while(map.size() < k){
                char leftchar = s.charAt(low);
                map.put(leftchar, map.get(leftchar) - 1);
                if(map.get(leftchar) == 0){
                    map.remove(leftchar);
                }
                low++;

                k = high - low +1;

            }
            // here means, map.size() == k
            // BCZ CAN'T*  BE > K

            int len = high - low +1;
            result = Math.max(len, result);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna