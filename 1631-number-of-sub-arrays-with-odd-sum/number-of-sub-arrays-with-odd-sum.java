class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        long mod = 1000000007;
        long ans=0,sum=0;
        long even=0, odd=0;
        for(int num:arr){
            sum+=num;
            if(sum%2!=0){
                ans+=(even+1);
                odd++;
            } 
            else{
                ans+=odd;
                even++;
            }
            ans%= mod;
        }
        return (int)(ans%mod);
    }
}