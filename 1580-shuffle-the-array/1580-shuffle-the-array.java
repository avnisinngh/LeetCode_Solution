class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        int s=0;
        int e=n;
        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[s];
            ans[i+1]=nums[e];
            s++;
            e++;
        }
        return ans;
    }
}