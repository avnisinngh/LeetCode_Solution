class Solution {
    public String findLatestTime(String s) {
        char[] ans = s.toCharArray();
        if (ans[0] == '?') {
            if (ans[1] == '1' || ans[1]=='?' || ans[1] == '0') {
                ans[0] = '1'; 
            } else {
                ans[0] = '0'; 
            }
        }
        if (ans[1] == '?') {
            if (ans[0] == '1') {
                ans[1] = '1'; 
            } else {
                ans[1] = '9';
            }
        }
        if (ans[3] == '?' ) {
            if(ans[4]=='0')
            ans[3] = '5'; 
            else{
                ans[3] = '5'; 
            }
        }
        if (ans[4] == '?') {
            if(ans[3]=='6'){
                ans[4] = '0';
            }else{
                ans[4] = '9';
            }
        }

        return new String(ans);
    }
}

