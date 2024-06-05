class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = 0;
        int zero =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }else{
                zero++;
            }
        }
        int oner = one - 1;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            while(oner-->0){
                ans.append('1');
            }
            while(zero-->0){
                ans.append('0');
            }
        }
        ans.append("1");
        return ans.toString();
    } 
}