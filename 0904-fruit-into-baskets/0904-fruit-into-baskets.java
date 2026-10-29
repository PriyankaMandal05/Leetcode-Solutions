class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int low =0;
        int res = Integer.MIN_VALUE;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int high =0; high <n ; high++){
            map.put(fruits[high], map.getOrDefault(fruits[high],0) + 1);

            if(map.size() > 2){ //HERE, K IS 2
                map.put(fruits[low], map.get(fruits[low])-1);
                if(map.get(fruits[low]) == 0 ){
                    map.remove(fruits[low]);
                }
                low ++;
            }
            else{ // map.size() < 2 or == 2
                int len = high -low +1;
                res = Math.max(res, len);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna