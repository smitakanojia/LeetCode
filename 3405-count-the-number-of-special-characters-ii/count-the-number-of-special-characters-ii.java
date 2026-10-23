class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> no = new HashSet<>();
        for(char c:word.toCharArray()) {
            if(Character.isLowerCase(c)){
                if(upper.contains(Character.toUpperCase(c))){
                    no.add(c);
                }
                lower.add(c);
            }
            else upper.add(c);
        }

        for(char c:lower){
            if(upper.contains(Character.toUpperCase(c)) && !no.contains(c)){
                count++;
            }
        }
        return count;
    }
}