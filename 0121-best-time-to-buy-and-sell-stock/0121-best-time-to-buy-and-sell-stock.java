class Solution {
    public int maxProfit(int[] prices) {
        // Your approach aims for a single-pass O(n) solution, which is optimal for this problem.
        // Time Complexity: O(n) where n = prices.length. Space Complexity: O(1).
        // However, the current implementation contains several compile-time and logical issues:
        // 1. Use Integer.MAX_VALUE (capital I) instead of INTEGER.MAX_VALUE.
        // 2. Variable names are inconsistent: you declared 'bup_p' but later reference 'buy_p' and 'buy_P'.
        //    All these should refer to the same variable that tracks the minimum price seen so far.
        // 3. The extra 'return 0;' after the closing brace of maxProfit() is illegal; it should be removed.
        // 4. The loop condition 'i <= prices.length-1' works but can be simplified to 'i < prices.length'.
        // 5. Ensure you update the minimum price when a lower price is encountered, and compute profit using that minimum.
        // Hint: Rename the variable to something clear like 'minPrice' and use it consistently throughout the method.
        // Example adaptation (keep the same structure, just replace variable names):
        //   int minPrice = Integer.MAX_VALUE;
        //   for (int i = 0; i < prices.length; i++) {
        //       if (prices[i] < minPrice) minPrice = prices[i];
        //       else maxprofit = Math.max(maxprofit, prices[i] - minPrice);
        //   }
        // Apply these corrections to obtain a working solution.
        // Fixed variable name mismatch and simplified loop condition.
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxprofit = Math.max(profit, maxprofit);
            }
        }
        return maxprofit;
    }
    // The following return statement is outside any method and will cause a compilation error.
    // It should be removed.
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna