import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes,Comparator.comparingInt(route->route[1]));
        int answer = 0;
        int last = Integer.MIN_VALUE;
        for(int[] a : routes){
            if(last>=a[0]&&last<=a[1]) continue;
            last = a[1];
            answer++;
        }
        return answer;
    }
}