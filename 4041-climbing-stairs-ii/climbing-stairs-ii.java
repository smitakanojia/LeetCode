class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int j=1; j<=n; j++){
            for(int k=1; k<=3; k++){
                int i=j-k;
                if(i>=0){
                    int temp = (j-i)*(j-i);
                    dp[j] = Math.min(dp[j], dp[i]+costs[j-1]+temp);
                }
            }
        }
        return dp[n];
    }
}