import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
            Arrays.sort(strings, Comparator.comparingInt(o -> o.charAt(n)));
            return strings;
    }
}