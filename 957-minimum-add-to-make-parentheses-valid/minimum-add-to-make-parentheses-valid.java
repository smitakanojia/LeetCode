class Solution {
    public int minAddToMakeValid(String s) {
        int cnt=0,ans=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') {
                stack.push('(');
                cnt++;
            }
            else{
                if(cnt>0) cnt--;
                else ans++;
            }
        }
        return cnt+ans;
    }
}