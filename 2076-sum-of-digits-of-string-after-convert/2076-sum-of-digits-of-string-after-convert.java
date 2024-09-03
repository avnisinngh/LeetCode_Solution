class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1;
            sb.append(value);
        }
        String current = sb.toString();
        while (k-- > 0) {
            int sum = 0;
            for (int i = 0; i < current.length(); i++) {
                sum += current.charAt(i) - '0';
            }
            current = String.valueOf(sum);
        }
        return Integer.parseInt(current);
    }
}