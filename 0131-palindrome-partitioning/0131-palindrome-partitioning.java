class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(s, 0, ans, path);
        return ans;
    }

    public void func(String s, int index, List<List<String>> ans, List<String> path) {
        if(index == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                path.add(s.substring(index, i+1));
                func(s, i+1, ans, path);
                path.remove(path.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}