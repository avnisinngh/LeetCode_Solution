class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums, nums.length, ans,new ArrayList<>(), 0);
        return ans;
    }
    public void subset(int[] nums, int n , List<List<Integer>>ans , List<Integer> ds, int index ) {
        ans.add(new ArrayList<>(ds));
        for(int i = index; i<n;i++) {
            if(i!=index && nums[i]==nums[i-1])  continue;
            ds.add(nums[i]);
            subset(nums, n, ans, ds, i +1);
            ds.remove(ds.size()-1);
        }
    }
}