class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int MOD = 1000000007;
        long [] power = new long[nums.length +1];
        power[0] = 1;
        for(int i = 1; i < power.length; i++){
            power[i] = (power[i-1] * 2) % MOD;
        }
        long ans = 0;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            if(nums[left] + nums[right] <= target){
                int diff = right - left;
                ans = (ans % MOD + power[diff]) % MOD;
                left++;
            }else right --;
        }
        return (int)ans;
    }
}