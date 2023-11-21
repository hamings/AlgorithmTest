import java.util.*;
class Solution {
    private Map<Character,Integer> toMap(String word){
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = word.toCharArray();
        for(char c : chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after))?1:0;
        
    }
}