class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int longest = 0;
        HashMap <Integer , Integer> map = new HashMap <>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i]==0?-1:1);
            if(sum == 0){
                longest = Math.max(longest , i+1);
            }
            if(map.containsKey(sum)){
                int k = map.get(sum);
                longest = Math.max(longest ,i - k);
            }else{
                map.put(sum ,i);
            }
        }
        return longest;
    }
}