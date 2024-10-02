class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] b = new int [n];
        for(int i = 0; i<n;i++){
            b[i] = arr[i];
        }
        Arrays.sort(b);
        int val = 0;
        for(int i = 0; i<n;i++){
            if(!map.containsKey(b[i])){
                val++;
                map.put(b[i], val);
            }
            
        }
        for(int i = 0; i<n;i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}