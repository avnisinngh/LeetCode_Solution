class Solution {
    public int minLength(String s) {
        StringBuilder snew = new StringBuilder(s);
        while(snew.indexOf("AB") != -1 || snew.indexOf("CD") != -1) {
            int indexAB = snew.indexOf("AB");
            if (indexAB != -1) {
                snew.delete(indexAB, indexAB + 2);
            }
            int indexCD = snew.indexOf("CD");
            if (indexCD != -1) {
                snew.delete(indexCD, indexCD + 2);
            }
        }
        return snew.length();
    }
}