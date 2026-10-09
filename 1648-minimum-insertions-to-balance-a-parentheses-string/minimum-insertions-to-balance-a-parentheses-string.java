class Solution {
    public int minInsertions(String s) {
        int ans=0,insert=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') insert++;
            else{
                if(i+1<s.length() && s.charAt(i+1)==')') i++;
                else ans++;
                if(insert>0) insert--;
                else ans++;
            }
        }
        return ans+insert*2;
    }
}