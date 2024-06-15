class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int[][] project=new int[n][2];
        for(int i=0;i<n;i++){
            project[i][0]=capital[i];
            project[i][1]=profits[i];
        }
        Arrays.sort(project,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(k-->0){
            while(i<n&&project[i][0]<=w){
                pq.add(project[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                break;
            }
            w+=pq.poll();
        }
        return w;
    }
}