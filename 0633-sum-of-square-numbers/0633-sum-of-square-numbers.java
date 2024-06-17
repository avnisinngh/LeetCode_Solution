class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left <= right){
            if(left*left + right*right > c){
                right--;
            }
            else if(left*left + right*right < c){
                left++;
            }
            if(left*left + right*right == c){
                return true;
            }
        }
        return false;
    }
}