class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int count = 0;
        for(int i = 0 ; i<n ; i++) {
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                count++;
            }else{
                count--;
            }
        }
        return count;
    }
}