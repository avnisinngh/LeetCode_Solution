class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int low =0;
        int high = tokens.length - 1;
        Arrays.sort(tokens);
        while(low <= high){
            if(tokens[low]<=power){
                score +=1;
                power -=tokens[low];
                low+=1;
            }else if(low<high && score >0){
                score -=1;
                power +=tokens[high];
                high -=1;
            }else{
            return score;
            }
        }
        return score;    
    }
}