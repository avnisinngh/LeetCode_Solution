class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> ans = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            boolean max = true;
            for(int j =0;j<n;j++){
                if((candies[i]+ extraCandies) < candies[j]){
                    max = false;
                }
            }
            ans.add(max);
        }
        return ans;
    }
}