class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int maxF = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            maxF = Math.max(maxF,map.get(num));
        }
        int count = 0;
        for(int frequency : map.values()){
            if (frequency == maxF) {
                count++;
            }
        }
        return maxF * count;
    }
}