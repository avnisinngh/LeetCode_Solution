class Solution {
    public int helper(int[] bloomDay,int mid,int k){
        int ans=0;
        int count=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }else{
                count=0;
            }
            if(count==k){
                ans++;
                count=0;
            }
        }
        return ans;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int left=0;
        int right=0;
        for(int it:bloomDay){
            right=Math.max(right,it);
        }
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(helper(bloomDay,mid,k)>=m){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}