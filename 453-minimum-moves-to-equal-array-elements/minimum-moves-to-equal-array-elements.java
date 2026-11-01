class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        long ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, nums[i]);
        }
        for(int i=0; i<n; i++){
            ans+=(long)nums[i]-min;
        }
        return (int)ans;
    }
}