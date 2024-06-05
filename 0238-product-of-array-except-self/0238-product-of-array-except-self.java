class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int noOfZeroes = 0, totalProduct = 1;
        for (int num : nums) {
            if (num == 0) {
                noOfZeroes++;
                continue; 
            } else {
                totalProduct *= num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (noOfZeroes == 0) {
                res[i] = totalProduct / nums[i];
            } else if (noOfZeroes == 1) {
                res[i] = nums[i] == 0 ? totalProduct : 0;
            }
        }
        return res;
    }
}