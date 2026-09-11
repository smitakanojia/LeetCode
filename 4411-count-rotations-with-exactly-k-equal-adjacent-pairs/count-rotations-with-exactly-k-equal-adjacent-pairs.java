class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int ans=0;
        for(int i=0; i<n; i++){
            String rotated=s.substring(i)+s.substring(0,i);
            int score=0;
            for(int j=0; j<n-1;j++){
                if(rotated.charAt(j)==rotated.charAt(j+1))score++;
            }
            if(score==k)ans++;
        }
        return ans;
    }
}