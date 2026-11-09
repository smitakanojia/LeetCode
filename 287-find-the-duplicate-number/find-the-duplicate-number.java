class Solution {
    public int findDuplicate(int[] nums) {
      HashSet<Integer> h1=new HashSet();
       for(int num:nums){
        if(h1.contains(num)) return num;
        h1.add(num);
       }
       return -1;  
    }
}