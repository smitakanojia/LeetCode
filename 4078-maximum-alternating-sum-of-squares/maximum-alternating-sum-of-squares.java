class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[] square = new long[n];
        for(int i=0; i<nums.length; i++){
            square[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(square);
        long ans=0;
        int temp=(n+1)/2;
        for(int i=0; i<n; i++){
            if(i<temp) ans+=square[n-i-1];
            else ans-=square[n-i-1];
        }
        return ans;
    }
}