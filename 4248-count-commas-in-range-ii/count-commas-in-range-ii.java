class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        long commas =0;
        long i = 1000;
        while(i<=n){
            commas+=n-i+1;
            i*=1000;
        }
        return commas;
    }
}