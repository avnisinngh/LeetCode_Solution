class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i<words.length;i++) {
            String s = words[i];
            boolean flag = false;
            for(int j = 0; j<s.length();j++) {
                String k  = Character.toString(s.charAt(j));
                if(allowed.contains(k)) flag = true;
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) count++;

        }
        return count;
    }
}