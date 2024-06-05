class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> val = new HashMap<>();
        int sum = 0;
        int total = 0;
        for(int n: nums){
            sum += n;
            if(sum == goal ){
                total++;
            }
            if (val.containsKey(sum - goal)){
                total += val.get(sum - goal);
            }
            val.put(sum, val.getOrDefault(sum, 0) + 1);
        }
        return total;
    }
}