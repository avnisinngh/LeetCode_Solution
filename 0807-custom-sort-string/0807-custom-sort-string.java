class Solution {
    public String customSortString(String order, String s) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<order.length();i++){
            char ch = order.charAt(i);
            for(int j = sb.length() - 1; j >= 0; j--){
                if(sb.charAt(j) == ch){
                    ans.append(ch);
                    sb.deleteCharAt(j);
                }
            }
        }
        ans.append(sb);
        return ans.toString();
    }
}