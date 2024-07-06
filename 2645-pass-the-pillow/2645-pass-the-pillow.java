class Solution {
    public int passThePillow(int n, int time) {
        int pass = 1;
        int person = 1;
        for(int i = 0;i<time;i++) {
            person += pass;
            if( person == 1 || person == n) {
                pass *= -1;
            }
        }
        return person;
    }
}