import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<String> strings = new HashSet<>();
        for(String s: my_string.split("")){
            if(strings.contains(s)) continue;
            sb.append(s);
            strings.add(s);
            
        }
        return sb.toString();
    }
}