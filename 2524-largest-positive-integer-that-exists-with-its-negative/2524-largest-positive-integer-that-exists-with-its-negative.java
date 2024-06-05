class Solution {
    public int findMaxK(int[] nums) {
      int res = -1;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : numSet) {
            if (numSet.contains(-num)) {
                res = Math.max(res, num);
            }
        }
        return res;
    }
};