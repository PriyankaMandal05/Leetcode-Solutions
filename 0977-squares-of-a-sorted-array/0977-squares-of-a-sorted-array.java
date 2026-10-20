class Solution {
    public int[] sortedSquares(int[] nums) {
       // CURRENT CODE ANALYSIS:
       // Logic: Splitting numbers into two lists (negative and positive), squaring them, 
       // reversing the negative list to make it sorted, and then merging them.
       // Time Complexity: O(N) - One pass to split, one pass to square, and one pass to merge.
       // Space Complexity: O(N) - Using two additional lists and a result array.
       

       List<Integer> negetive = new ArrayList<>();
       List<Integer> positive = new ArrayList<>();
       
       // add + /- no. in lists
       for(int i = 0; i< nums.length ; i++){
        if(nums[i] >= 0){
            positive.add(nums[i]);

        }
        else{
            negetive.add(nums[i]);
        }
        }

        // check whether +/ - no. are there or not

        int[] result = new int[negetive.size() + positive.size()];
       if(positive.size() == 0){
        // means only neg no. 
        for(int i=0; i< negetive.size(); i++){
            negetive.set(i, negetive.get(i) * negetive.get(i));
            }
            Collections.reverse(negetive);
            return negetive.stream().mapToInt(Integer::intValue).toArray();
        

       }
     else if(negetive.size() == 0){
        // means only positive no. 
        for(int i=0; i< positive.size(); i++){
        positive.set(i, positive.get(i) * positive.get(i));
        }
        return positive.stream().mapToInt(Integer::intValue).toArray();

       }

        
       

       else{
        // if both +ve  and -ve numbers present 
        // hence, positive and negetive lists BOTH != 0
        
        // Squaring the lists
        for(int i=0; i<negetive.size(); i++ ){
            negetive.set(i, negetive.get(i) * negetive.get(i));

        }
        Collections.reverse(negetive);

        for(int i=0; i<positive.size(); i++ ){
            positive.set(i, positive.get(i) * positive.get(i));

        }
        int index = 0; // for result list
         

        // Merging two sorted arrays (TWO POINTER ***)
        int i =0 ; int j=0;
        while(i < negetive.size() &&  j < positive.size()){
        if(negetive.get(i) <= positive.get(j)){
           result[index] = negetive.get(i);
            index++;
            i++;
        }
        else {
             result[index] = positive.get(j);
            index++;
            j++;
        }
        } // while loop over => means both i & j out of array ot atleast one.


        // when j out of array.
        while( i < negetive.size()){
            result[index] = negetive.get(i);
            index++;
            i++;
        }
        // when i out of array.
        while( j < positive.size()){
             result[index] = positive.get(j);
            index++;
            j++;
        }



       }

       
       return result;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna