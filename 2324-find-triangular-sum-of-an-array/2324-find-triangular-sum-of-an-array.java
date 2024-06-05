class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(list.size() != 1){
            list = sum(list);
        }        
        return list.get(0) ;
    }
    public ArrayList<Integer> sum(List<Integer> list){
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = 0; i< list.size()-1 ; i++){
            ans.add((list.get(i) + list.get(i+1))%10);
        }
        return ans;
    }
}