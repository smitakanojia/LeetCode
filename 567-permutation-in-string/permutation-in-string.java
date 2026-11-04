class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map= new int[26];
        for(char c:s1.toCharArray()) map[c-'a']++;
        int j=0,i=0;
        int count=s1.length();
        while(j<s2.length()){
            if(map[s2.charAt(j++)-'a']-->0)
                count--;
            if(count==0) return true;
            if(j-i==s1.length() && map[s2.charAt(i++)-'a']++>=0)
                count++;
        }
        return false;
    }
}