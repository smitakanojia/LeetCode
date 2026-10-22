class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int shift=0;
        boolean ok=true , ok1=true;
        while(nums[shift]!=0) shift++;
        for(int i=0; i<n-1; i++){
            if(nums[(shift+i)%n]+1 != nums[(shift+i+1)%n]) ok=false;
            if(nums[(shift-i+n)%n]+1 != nums[(shift-i-1+n)%n]) ok1=false;
        }
        if(ok) return Math.min(shift, 1+n-shift +1);
        if(ok1) return Math.min(1+n-shift-1, shift+2);
        return -1;
    }
}