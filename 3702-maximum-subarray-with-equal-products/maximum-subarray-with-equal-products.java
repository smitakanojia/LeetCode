class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int l=0, right=n-1;
        int len=0;
        for(int i=0; i<n; i++) {
            long gcd=0;
            long lcm=1;
            long product=1;
            for(int j=i; j<n; j++){
                product*=nums[j];
                gcd=gcd(gcd, nums[j]);
                lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
                if(product==gcd*lcm){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;    
    }
    public long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}