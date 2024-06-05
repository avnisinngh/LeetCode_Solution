class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap <Integer , List<Integer>> map = new HashMap();
        List<List<Integer>> result = new ArrayList();
        for(int i = 0; i<groupSizes.length ; i++) {
            int person = i;
            int groupSize = groupSizes[i];
            List<Integer> list = map.getOrDefault(groupSize, new ArrayList());
            list.add(person);
            map.put(groupSize , list);
            if(list.size() == groupSize){
                result.add(list);
                map.remove(groupSize);
            }
        }
        return result;
    }
}