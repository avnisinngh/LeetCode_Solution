class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            int count = 0;
            char c = word.charAt(i);
            count++;
            int k = i + 1;
            while(count < 9 && k  <word.length() &&  c == word.charAt(k)) {
                count++;
                k++;
                i++;
            }
            comp.append(count);
            comp.append(word.charAt(i));
        }
        return comp.toString();
    }
}