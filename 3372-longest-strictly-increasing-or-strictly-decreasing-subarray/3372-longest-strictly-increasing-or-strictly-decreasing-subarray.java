class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max1 = 1;
        for(int left = 0, right = 1; right < nums.length; right++){
            if (nums[right - 1] < nums[right]) {
                max1 = Math.max(max1, right - left + 1);
            } else {
                left = right;
            }
        }
        
        int max2 = 1;
        for(int left = 0, right = 1; right < nums.length; right++) {
            if (nums[right - 1] > nums[right]) {
                max2 = Math.max(max2, right - left + 1);
            } else {
                left = right;
            }
        }
        
        return Math.max(max1,max2);
    }
}