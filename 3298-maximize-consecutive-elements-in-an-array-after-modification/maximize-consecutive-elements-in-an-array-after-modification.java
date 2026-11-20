class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int[] dp = new int[max+2];
        int len=1;
        for(int num:nums){
            dp[num+1]=dp[num]+1;
            dp[num]=dp[num-1]+1;
            len=Math.max(len,Math.max( dp[num], dp[num+1]));

        }
        return len;
    }
}