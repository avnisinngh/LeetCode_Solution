class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean flag = false;
        int max =  0;
        int left = 0;
        int right = 0;
        while(right < nums.length){
                if(isPrime(nums[right])){
                    while (!isPrime(nums[left]) && left <=right) {
                    left++;
                }
                max = Math.max(max, right - left );
                }
                
            right++;
            }
        return max;
    }
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
            return false;
            }
        }
    return true;
    }
    
}