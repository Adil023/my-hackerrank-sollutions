class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> mapA = new HashMap<>();
        Map<Character, Character> mapB = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char charS =  s.charAt(i);
            char charT =  t.charAt(i);

            if(mapA.containsKey(charS) && mapA.get(charS) != charT) return false;
            if(mapA.containsKey(charT) && mapA.get(charT) != charS) return false;

            mapA.put(charS,charT);
            mapB.put(charT,charS);
        }

        return true;
    }
}