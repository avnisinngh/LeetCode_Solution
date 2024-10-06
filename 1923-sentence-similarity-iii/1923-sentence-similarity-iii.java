class Solution {

    public boolean areSentencesSimilar(String s1, String s2) {
        String[] s1Words = s1.split(" "), s2Words = s2.split(" ");
        int start = 0, ends1 = s1Words.length - 1, ends2 =
            s2Words.length - 1, s1WordsLength = s1Words.length, s2WordsLength =
            s2Words.length;
        if (s1WordsLength > s2WordsLength) {
            return areSentencesSimilar(s2, s1);
        }
        while (start < s1WordsLength && s1Words[start].equals(s2Words[start])) {
            ++start;
        }
        while (ends1 >= 0 && s1Words[ends1].equals(s2Words[ends2])) {
            --ends1;
            --ends2;
        }
        return ends1 < start;
    }
}