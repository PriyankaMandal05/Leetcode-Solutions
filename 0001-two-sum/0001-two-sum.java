class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> result = new HashMap <>();
        for(int i =0; i< nums.length; i++){
            int current_num = nums[i];
            int more_needed = target - current_num;
            if(result.containsKey(more_needed)){
                return new int[] {result.get(more_needed) , i};
            }
            else{result.put(current_num , i);}
        }
        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna