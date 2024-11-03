class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String doublestring = s+s;
        return doublestring.contains(goal);
    }
}