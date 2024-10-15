class Solution {
    public long minimumSteps(String s) {
        long min = 0;
        int zero = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                min += (i- zero);
                zero++;
            }
        }
        return min;
    }
}