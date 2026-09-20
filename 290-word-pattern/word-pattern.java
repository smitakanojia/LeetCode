class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map= new HashMap<>();
        HashSet<String> seen= new HashSet<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) return false;
        
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(w)){
                    return false;
                }
            }
            else{
                if(seen.contains(w)) return false;
                map.put(c,w);
                seen.add(w);
            }
        }
        return true;
    }
}