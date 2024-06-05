class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxprod=Integer.MIN_VALUE,curprod=1;
        for(int i=0;i<nums.length;i++){
            curprod*=nums[i];
            maxprod=Math.max(curprod,maxprod);
            if(curprod==0) curprod=1;
            
        }
        curprod=1;
        for(int i=nums.length-1;i>=0;i--){
            curprod*=nums[i];
            maxprod=Math.max(curprod,maxprod);
            if(curprod==0) curprod=1;
            
        }
        return maxprod;
    }
}