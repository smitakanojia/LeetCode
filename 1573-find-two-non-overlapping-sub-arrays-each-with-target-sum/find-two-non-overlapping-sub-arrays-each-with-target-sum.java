class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int[] best=new int[n];
        Arrays.fill(best,Integer.MAX_VALUE);
        int j=0,sum=0;
        int minlen=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>target)sum-=arr[j++];
            if(sum==target){
                int len=i-j+1;
                if(j>0 && best[j-1]!=Integer.MAX_VALUE){
                    ans=Math.min(ans, len+best[j-1]);
                }
                minlen=Math.min(minlen,len);
            }
            best[i]=minlen;
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}