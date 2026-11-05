class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        int h=0;
        while(l<=r){
            h=(l+r)/2;
            if(nums[h]==target) return h;
            else if (nums[h]<target) l=h+1;
            else r=h-1;
        }
        return -1;
    }
}