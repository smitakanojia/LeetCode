class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0; 
        for(int num:nums) sum+=num;
        int max=-1;
        int currsum=0;
        int left=0, right=0;
        for(; right<nums.length; right++) {
            currsum+=nums[right];
            while(left<= right && currsum>sum-x) {
                currsum-=nums[left++];
            }
            if(currsum==sum- x) max=Math.max(max, right-left+1);
        }
        return max==-1?-1: nums.length-max;
    }
}