class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int [] check = heights.clone();
        Arrays.sort(check);
        int count = 0;
        for(int i = 0; i < n;i++) {
            if(check[i] != heights[i])
                count++;
            
        }
        return count;
    }
}