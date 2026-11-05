class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)max=Math.max(max,piles[i]);
        int l = 1,r=max;
        int ans=0;
        while(l<r){
            int mid = (l+r)/2;
            int hours=0;
            for(int i=0; i<n; i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h) r=mid;
            else l=mid+1;
        }

        return l;
    }
}