class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if (lenS != lenT) return false;

        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        for(int i=0;i<lenS;i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(int i=0;i<lenS;i++){
            char charS = s.charAt(i);
            int countS = mapS.get(charS);
            int countT = mapT.getOrDefault(charS, 0);
            if (countS != countT){
                return false;
            }
        }
        return true;
    }
}
