class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] arr = nums.clone();
        Arrays.sort(arr);
        for(int i=0;i<nums.length;i++){
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            map.put(arr[i],i);
        }
        for(int i=0;i<nums.length;i++){
            arr[i] = map.get(nums[i]);
        }
        return arr;
    }
}