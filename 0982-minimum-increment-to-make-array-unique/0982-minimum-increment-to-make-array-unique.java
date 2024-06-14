class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int numTracker = 0; 
        int minIncrement = 0; 

        for (int num : nums) {
            numTracker = Math.max(numTracker, num);
            minIncrement += numTracker - num;
            numTracker += 1;
       }

        return minIncrement;
    }
}