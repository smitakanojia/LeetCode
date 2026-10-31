class Solution {
    public int uniquePaths(int[][] grid) {
        int mod= 1000000007;
        int[][][] mat = {{{1,1}, {1,1}}, {{0,1},{1,0}}};
        int n = grid[0].length, left=0;
        int[] dp = new int[n];
        dp[0]=1;
        for(int[] row: grid){
            left=0;
            for(int j=0; j<n; j++){
                int top = dp[j];
                int c=row[j];
                dp[j] = (left* mat[c][1][0] + top*mat[c][1][1])%mod;
                left = (left*mat[c][0][0] + top*mat[c][0][1])%mod;
            }
        }
        return left;
    }
}