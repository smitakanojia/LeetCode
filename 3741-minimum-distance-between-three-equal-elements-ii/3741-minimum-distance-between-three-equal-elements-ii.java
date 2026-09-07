class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for(ArrayList<Integer> list:map.values()){
            if(list.size()>=3){
                for(int i=0; i<=list.size()-3; i++){
                    int x=list.get(i);
                    int y = list.get(i+1);
                    int z = list.get(i+2);
                    int dist = Math.abs(x-y)+Math.abs(y-z)+Math.abs(x-z);

                    min  = Math.min(min,dist);
                }
            }
        } 
        if(min == Integer.MAX_VALUE) return -1;
        else return min;
    }
}