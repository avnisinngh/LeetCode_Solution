class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int count = 0;
        int imbalance = 0;
        int balance = 0;
        for(int i = 0; i<n;i++){
            if(s.charAt(i)=='[') imbalance++;
            else imbalance--;
            if(imbalance < 0){
                count++;
                imbalance = 1;
            }
        }
        return count;
    }
}