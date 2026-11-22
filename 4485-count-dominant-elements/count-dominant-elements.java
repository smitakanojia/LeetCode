class Solution {
    public int countDominantElements(int[] nums) {
        int ans=0;
        int n=nums.length;
        if(nums.length==1) return 1;
        if(nums[0] >= nums[1])ans++;
        if(nums[n-1]>=nums[n-2]) ans++; 
        for(int i=1; i<nums.length-1; i++){
            double avg=(nums[i-1] + nums[i+1])/2.0;
             if(nums[i]>=avg)ans++;   
        }
        return ans;
    }
}