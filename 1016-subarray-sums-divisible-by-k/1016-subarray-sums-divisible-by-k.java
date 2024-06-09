class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            int mod=sum%k;
            if(mod<0){
                mod+=k;
            }
            if(map.containsKey(mod)){
                count+=map.get(mod);
                map.put(mod,map.get(mod)+1);
            }else{
                map.put(mod,1);
            }
        }
        return count;
    }
}