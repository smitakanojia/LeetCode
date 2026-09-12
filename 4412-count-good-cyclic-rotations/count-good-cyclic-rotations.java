class Solution {
    public int countGoodRotations(int[] nums) {
        long sum=0; 
        for(int num:nums) sum+=num; 
        long pre=0;
        long ans= 0; 
        int n = nums.length;
        for(int i=0; i<n;i++){
            if(i>=n/2){
                if(pre!=sum-pre)ans++;
                pre-=nums[i-n/2]; 
            }
            pre+=nums[i];
        }
        return (int)ans;
    }
}