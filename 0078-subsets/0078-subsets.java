class Solution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Subsets(nums, 0, ans,sub);
        return ans;
    }
    public void Subsets(int[]nums , int ind , List<List<Integer>> ans ,List<Integer> sub) {
        if(ind == nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[ind]);
        Subsets(nums, ind+1, ans, sub);
        sub.remove(sub.size()-1);
        Subsets(nums, ind+1, ans, sub);
    }
}