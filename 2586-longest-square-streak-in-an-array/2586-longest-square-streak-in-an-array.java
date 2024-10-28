class Solution {
    public int longestSquareStreak(int[] nums) {
        int longestStreak = 0;
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int num : nums) {
            uniqueNumbers.add(num);
        }
        for(int start : nums) {
            int currStreak = 0;
            long curr = start;
            while(uniqueNumbers.contains((int)curr)) {
                currStreak++;
                if(curr*curr > 1e5) break;
                curr *= curr;
            }
            longestStreak = Math.max(longestStreak, currStreak);
        }
        return longestStreak < 2 ? -1 : longestStreak;
    }
}