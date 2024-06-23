class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean [] map = new boolean [nums.length];
        List<Integer> ds = new ArrayList<>();
        recper(nums,ans,map, ds);
        return ans;
    }
    public void recper(int [] nums,List<List<Integer>>ans , boolean[] map, List<Integer> ds) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++) {
            if(!map[i]){
                map[i] = true;
                ds.add(nums[i]);
                recper(nums,ans,map,ds);
                ds.remove(ds.size()-1);
                map[i] = false;
            }
        }
    }
}