class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return n;
        }
        int lv = 1;
        int rv = n;
        int ls = lv;
        int rs = rv;
        while(lv < rv){
            if(ls < rs){
                ls += ++lv;
            }else{
                rs += --rv;
            }
            if(ls == rs && lv +1 == rv -1){
                return lv +1;
            }
        }
        return -1;
    }
}